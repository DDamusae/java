package jdbc;

import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDriver;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class DBCPInit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DBCPInit() {
        super();
   
    }

	public void init(ServletConfig config) throws ServletException {
		loadJDBCDriver();
		initConnectionPool();
	
	}
	
	//커넥션 풀이 내부에서 사용할 JDBC드라이버(OracleDriver)를 로드한다.
	private void loadJDBCDriver() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ex) {
			throw new RuntimeException("fail to load JDBC Driver", ex);
		}
	}
	
	
	private void initConnectionPool() {
		try {
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "jspdb";
			String pw = "jspdb";
			
			//커넥션 풀이 새로운 커넥션을 생성할 때 사용할 커넥션 팩토리를 생성. oracle에 연결할때 사용할 url, 계정, 암호 지정.
			ConnectionFactory connFactory = new DriverManagerConnectionFactory(jdbcUrl, username, pw);
			
			//PoolableConnection을 생성하는 팩토리 생성. DBCP는 커넥션 풀에 커넥션을 보관할 때 PoolableConnection을 사용한다.
			//이 클래스는 내부적으로 실제 커넥션을 담고 있으며, 커넥션 풀을 관리하는데 필요한 기능을 추가로 제공한다.
			//예를들어 close() 메소드를 실행하면 실제 커넥션을 종료하지 않고 풀에 커넥션을 반환.
			PoolableConnectionFactory poolableConnFactory = new PoolableConnectionFactory(connFactory, null);
			poolableConnFactory.setValidationQuery("select 1"); //커넥션이 유효한지 여부 검사할때 사용할 쿼리 지정.
			
			//커넥션 풀의 설정 정보 생성.
			GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig<>();
			poolConfig.setTimeBetweenEvictionRunsMillis(1000L*60L*5L); //유휴 커넥션 검사 주기
			poolConfig.setTestWhileIdle(true); //풀에 보관중인 커넥션이 유효한지 검사 여부
			poolConfig.setMinIdle(4); //커넥션 최소 개수
			poolConfig.setMaxIdle(50); //커넥션 최대 개수
			
			//커넥션 풀 생성. PoolableConnection을 생성할 때 사용할 팩토리와 커넥션 풀 설정을 파라미터로받는다.
			GenericObjectPool<PoolableConnection> connectionpool = new GenericObjectPool<>(poolableConnFactory, poolConfig);
			poolableConnFactory.setPool(connectionpool); //PoolableConnectionFactory에도 위에 생성한 커넥션 풀을 연결.
			
			//커넥션 풀을 제공하는 JDBC드라이버 등록
			Class.forName("org.apache.commons.dbcp2.PoolingDriver");
			PoolingDriver driver = (PoolingDriver)DriverManager.getDriver("jdbc:apache:commons:dbcp:");
			
			//커넥션 풀 드라이버에 생성한 커넥션 풀 등록. 이름("Ch15_GuestBook")
			driver.registerPool("Ch15_GuestBook", connectionpool);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
