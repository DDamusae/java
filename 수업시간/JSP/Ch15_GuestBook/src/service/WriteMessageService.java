package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.MessageDao;
import jdbc.JdbcUtil;
import dto.Message;
import jdbc.ConnectionProvider;

public class WriteMessageService {
	//싱글톤 패턴
	private static WriteMessageService instance = new WriteMessageService();
	
	public static WriteMessageService getInstance() {
		return instance;
	}
	
	private WriteMessageService() {
	}
	
	//테이블에 파라미터로 받은 메시지 등록
	public void write(Message message) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			MessageDao messageDao = MessageDao.getInstance();
			messageDao.insert(conn, message);
		}catch (SQLException e) {
			throw new ServiceException("메시지 등록 실패: " + e.getMessage());
		}finally {
			JdbcUtil.close(conn);
		}
	}
}
