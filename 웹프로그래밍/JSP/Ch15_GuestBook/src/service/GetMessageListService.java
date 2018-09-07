package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import dao.MessageDao;
import jdbc.JdbcUtil;
import dto.Message;
import jdbc.ConnectionProvider;

public class GetMessageListService {
	//싱글톤 패턴
	private static GetMessageListService instance = new GetMessageListService();
	
	public static GetMessageListService getInstance() {
		return instance;
	}
	
	private GetMessageListService() {

	}
	
	//한 페이지 당 보여 줄 메시지 수
	private static final int MESSAGE_COUNT_PER_PAGE = 3;
	
	
	public MessageListView getMessageList(int pageNumber) {
		Connection conn = null;
		int currentPageNumber = pageNumber;
		try{
			conn = ConnectionProvider.getConnection();
			MessageDao messageDao = MessageDao.getInstance();
			
			//MessageDao의 selectCount메소드를 사용하여 전체 메시지 개수를 구한다.
			int messageTotalCount = messageDao.selectCount(conn); 
			
			List<Message> messageList = null;
			int firstRow = 0;
			int endRow = 0;
			
			//메시지 개수가 0보다 크면 요청한 페이지에 속하는 메시지의 시작 행과 끝 행을 구한다.
			if(messageTotalCount > 0) { 
				firstRow = (pageNumber - 1) * MESSAGE_COUNT_PER_PAGE +1;
				endRow = firstRow + MESSAGE_COUNT_PER_PAGE - 1;
				messageList = messageDao.selectList(conn, firstRow, endRow); //시작 행과 끝 행 사이의 메시지 목록을 구한다.
			}else { //메시지 개수가 0이면 빈 리스트를 messageList에 할당.
				currentPageNumber = 0;
				messageList = Collections.emptyList(); 
			}
			//요청한 페이지 목록, 전체 메시지 개수, 현재 페이지 번호, 페이지당 페시지 개수, 시작 행, 끝 행의 정보를 담아 MessageListView객체를 반환.
			return new MessageListView(messageList, messageTotalCount, currentPageNumber, MESSAGE_COUNT_PER_PAGE, firstRow, endRow);
		} catch (SQLException e) {
			throw new ServiceException("목록 구하기 실패: " + e.getMessage(), e);
		}finally {
			JdbcUtil.close(conn);
		}
	}
}
