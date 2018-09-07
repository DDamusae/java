package config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.spring.changepw.service.ChangePasswordService;
import com.spring.login.auth.AuthService;
import com.spring.register.dao.MemberDao;
import com.spring.register.service.MemberRegisterService;

@Configuration
@EnableTransactionManagement
public class MemberConfig {
	
//	<bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource" destroy-method="close">
//		<property name="driverClass" value="com.mysql.jdbc.Driver" />
//		<property name="jdbcUrl" value="jdbc:mysql://localhost/test?characterEncoding=utf8" />
//		<property name="user" value="spring" />
//		<property name="password" value="spring" />
//	</bean>
	@Bean
	public DataSource dataSource() {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		
		try {
			ds.setDriverClass("com.mysql.jdbc.Driver");
			ds.setJdbcUrl("jdbc:mysql://localhost/test?characterEncoding=utf8");
			ds.setUser("spring");
			ds.setPassword("spring");
		} catch (PropertyVetoException e) {
			
		}
		return ds;
	}
	
	
	//<tx:annotation-driven transaction-manager="transactionManager" />
	//<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
	//	<property name="dataSource" ref="dataSource"/>
	//</bean>
	@Bean
	public DataSourceTransactionManager transactionManager() {
		DataSourceTransactionManager txMgr = new DataSourceTransactionManager();
		txMgr.setDataSource(dataSource());
		return txMgr;
	}
	
	//bean id="memberDao" class="com.spring.register.dao.MemberDao">
	//	<constructor-arg ref="dataSource" />
	//</bean>
	@Bean
	public MemberDao memberDao() {
		return new MemberDao(dataSource()); 
	}
	
	//<bean id="memberRegSvc" class="com.spring.register.service.MemberRegisterService">
	//	<constructor-arg ref="memberDao" />
	//</bean>
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}
	
	//<bean id="changePwdSvc" class="com.spring.changepw.service.ChangePasswordService">
	//	<constructor-arg ref="memberDao" />
	//	</bean>
	@Bean
	public ChangePasswordService changePwdSvc() {
		return new ChangePasswordService(memberDao());
	}
	
	//<bean id="authService" class="com.spring.login.auth.AuthService">
	//	<property name="memberDao" ref="memberDao" />
	//</bean>
	@Bean
	public AuthService authService() {
		AuthService authService = new AuthService();
		authService.setMemberDao(memberDao());
		return authService;
	}
}
