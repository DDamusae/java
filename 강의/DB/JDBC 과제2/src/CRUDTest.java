import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDTest {
	Connection con;
	
	static {
		try {
			// ojdbc6_g: DB연결을 위한 Driver(연결 프로그램)
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void connect() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "javadb";
		String pwd = "javadb";
		
		try {
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("Connection Success!");
		} catch (SQLException e) {
			
		}
	}

	public void insert() {
		// member table에 'aaa','1111','홍길동','22','서울시','a@a.com' 입력하기
		Statement stmt = null;
		try {
			String query = "Insert Into Member Values('aaaa', 'aaaa', '이말년', '30', '안산시', 'm@m.com')"; //SQL문
			stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			
			if(count > 0) {
				System.out.println("insert success");
			}
		} catch (SQLException e) {
			System.out.println("insert fail");
		}
	}

	public void select() {
		// member 테이블 모든 내용 검색하기
		try {
			String query = "SELECT * FROM Member"; //SQL문
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.printf("아이디: %s", rs.getString(1));
				System.out.printf(", 비밀번호: %s", rs.getString(2));
				System.out.printf(", 이름: %s", rs.getString(3));
				System.out.printf(", 나이: %s", rs.getInt(4));
				System.out.printf(", 주소: %s", rs.getString(5));
				System.out.printf(", 이메일: %s", rs.getString(6));
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update() {
		// id='aaa'를 찾아서 addr='부산시'로 변경하기
		Statement stmt = null;
		try {
			String query = "Update Member Set addr = '부산시' Where id = 'aaaa'"; //SQL문
			stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			
			if(count > 0) {
				System.out.println("update success");
			}
		} catch (SQLException e) {
			System.out.println("update fail");
		}
	}

	public void delete() {
		// id='aaa'를 찾아서 행을 삭제하기
		Statement stmt = null;
		try {
			String query = "Delete from Member Where id = 'aaaa'"; //SQL문
			stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			
			if(count > 0) {
				System.out.println("delete success");
			}
		} catch (SQLException e) {
			System.out.println("delete fail");
		}
	}

	public static void main(String[] args) {
		CRUDTest st = new CRUDTest();
		st.connect();
		
		st.insert();
		System.out.println("insert 수행 후");
		st.connect();
		st.select();
		
		st.update();
		System.out.println("update 수행 후");
		st.connect();
		st.select();
		
		st.delete();
		System.out.println("delete 수행 후");
		st.connect();
		st.select();
		
	}

}
