package javalogintest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginSVC {
	Connection con;
	Statement stmt;
	static{
		try {
			// ojdbc6_g: DB연결을 위한 Driver(연결 프로그램)
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void connect(){
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "javacon";
		String pwd = "javacon";
		
		try {
			con = DriverManager.getConnection(url, userid, pwd);
		} catch (SQLException e) {
			System.out.println("Connection Fail");
		}
	}
	
	public User login(String id, String passwd) {
		User user = null;
		try {
			String query = "SELECT * FROM MEMBER"; //SQL문
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				if(rs.getString(1).equals(id) && rs.getString(2).equals(passwd)) {
					System.out.println("Connection Success!");
					user = new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6));
				}
			}
			
		} catch (SQLException e) {
			System.out.println("로그인 실패");
		} 
		
		return user;
	}
}
