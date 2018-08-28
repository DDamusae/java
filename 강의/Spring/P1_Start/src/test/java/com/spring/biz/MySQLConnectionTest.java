package com.spring.biz;
//P70
import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class MySQLConnectionTest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false";
	private static final String USER = 	"spring";
	private static final String PW = "spring"; 
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		//try~with : finally 없이 자동 close() 수행
		//안에 선언되는 객체는 AutoClosable 인터페이스를 구현하는 객체여야 한다.
		try(Connection con = DriverManager.getConnection(URL,USER,PW)){
			System.out.println(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
