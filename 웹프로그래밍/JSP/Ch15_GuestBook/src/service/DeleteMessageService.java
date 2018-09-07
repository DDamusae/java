package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.MessageDao;
import jdbc.JdbcUtil;
import dto.Message;
import jdbc.ConnectionProvider;

public class DeleteMessageService {
	//싱글톤 패턴
	private static DeleteMessageService instance = new DeleteMessageService();
	
	public static DeleteMessageService getInstance() {
		return instance;
	}
	
	private DeleteMessageService() {
		
	}
	
	//메시지 삭제
	public void deleteMessage(int messageid, String password) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false); //트랜잭션 시작
			
			MessageDao messageDao = MessageDao.getInstance();
			Message message = messageDao.select(conn, messageid); //삭제 할 메시지 선택.
			
			if(message == null) { //메시지가 없으면 익셉션 발생
				throw new MessageNotFoundException("메시지 없음");
			}
			if(!message.matchPassword(password)) { //암호가 일치하지 않으면 익셉션 발생
				throw new InvalidPasswordException("bad password");
			}
			//위 두 경우에 해당하지 않으면 해당 메시지 삭제
			messageDao.delete(conn, messageid);
			conn.commit();
		}catch (SQLException e) { //SQL익셉션 발생 시 롤백 수행.
			JdbcUtil.rollback(conn);
			throw new ServiceException("삭제 실패: " + e.getMessage(), e);
		}catch (InvalidPasswordException | MessageNotFoundException e) { //메시지가 없거나 암호가 일치하지 않아 익셉션 발생 시 롤백 후 익셉션 재발생.
			JdbcUtil.rollback(conn);
			throw e;
		}finally {
			JdbcUtil.close(conn);
		}
	}
}
