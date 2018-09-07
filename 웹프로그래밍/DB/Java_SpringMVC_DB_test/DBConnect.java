package test07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnect {
	static Connection con = null;
	static PreparedStatement pstmt = null;
	static {
		try {
			// ojdbc6_g: DB연결을 위한 Driver(연결 프로그램)
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {

		}
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "javadb";
		String pwd = "javadb";

		try {
			con = DriverManager.getConnection(url, userid, pwd);
		} catch (SQLException e) {

		}

	}

}
