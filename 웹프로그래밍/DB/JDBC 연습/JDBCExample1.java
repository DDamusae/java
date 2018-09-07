package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {
	Connection con;
	
	public JDBCExample1() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "madang";
		String pwd = "madang";
		
		try {
			//ojdbc6_g: DB연결을 위한 Driver(연결 프로그램)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("데이터베이스 연결 준비...");
				con = DriverManager.getConnection(url, userid, pwd);
				System.out.println("데이터베이스 연결 성공");
			} catch (SQLException e) {
				
			}
		}
	}
	
	private void sqlRun() {
		try {
			String query = "SELECT * FROM GOODSINFO"; //SQL문
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.print(String.format("%5s", "CODE"));
			System.out.print(String.format("%10s", "NAME"));
			System.out.print(String.format("%10s", "PRICE"));
			System.out.println(String.format("%10s", "MAKER"));
			System.out.println("------------------------------------");
			while(rs.next()) {
				System.out.print(String.format("%5s", rs.getString(1)));
				System.out.print(String.format("%10s", rs.getString(2)));
				System.out.print(String.format(" %10s", rs.getInt(3)));
				System.out.println(String.format("%10s", rs.getString(4)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		JDBCExample1 je = new JDBCExample1();
		je.sqlRun();
	}
}
