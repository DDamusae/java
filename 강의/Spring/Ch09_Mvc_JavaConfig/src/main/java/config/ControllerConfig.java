package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.spring.changepw.controller.ChangePwdController;
import com.spring.changepw.service.ChangePasswordService;
import com.spring.list.controller.MemberDetailController;
import com.spring.list.controller.MemberListController;
import com.spring.login.auth.AuthService;
import com.spring.login.controller.LoginController;
import com.spring.login.controller.LogoutController;
import com.spring.login.interceptor.AuthCheckInterceptor;
import com.spring.register.controller.RegisterController;
import com.spring.register.dao.MemberDao;
import com.spring.register.service.MemberRegisterService;
import com.spring.survey.controller.SurveyController;

@Configuration
public class ControllerConfig extends WebMvcConfigurerAdapter{
	@Autowired
	public MemberRegisterService memberRegSvc;
	@Autowired
	public ChangePasswordService changePwdSvc;
	@Autowired
	private AuthService authService;
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private AuthCheckInterceptor authCheckInterceptor; 
	
	//<mvc:view-controller path="/main" view-name="main" />
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/main").setViewName("main");
	}
	
	
//	<mvc:interceptors>
//		<mvc:interceptor>
//			<mvc:mapping path="/edit/**"/>
//			<mvc:exclude-mapping path="/edit/add/*"/>
//			<bean class="com.spring.login.interceptor.AuthCheckInterceptor"></bean>
//		</mvc:interceptor>
//	</mvc:interceptors>
//	<!-- 	Ant Pattern: *: 0개 또는 그 이상의 글자 -->
//	<!-- 				 ?: 1개 글자 -->
//	<!-- 				 **: 0개 또는 그 이상의 디렉토리 경로 -->
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authCheckInterceptor).addPathPatterns("/edit/**");
	}
	
	
	@Bean
	public AuthCheckInterceptor authCheckInterceptor() {
		return new AuthCheckInterceptor();
	}
	
	//bean class="com.spring.register.controller.RegisterController">
	//	<property name="memberRegisterService" ref="memberRegSvc"/>
	//</bean>
	@Bean	
	public RegisterController registerController() {
		RegisterController regCtrl = new RegisterController();
		regCtrl.setMemberRegisterService(memberRegSvc);
		return regCtrl;
	}
	
	//<bean class="com.spring.survey.controller.SurveyController"></bean>
	@Bean
	public SurveyController surveyController() {
		return new SurveyController();
	}
	
	//<bean class="com.spring.login.controller.LoginController">
	//	<property name="authService" ref="authService"/>
	//</bean>
	@Bean
	public LoginController loginController() {
		LoginController loginCtrl = new LoginController();
		loginCtrl.setAuthService(authService);
		return loginCtrl;
	}
	
	
	//<bean class="com.spring.login.controller.LogoutController"></bean>
	@Bean
	public LogoutController logoutController() {
		return new LogoutController();
	}
	
	//<bean class="com.spring.changepw.controller.ChangePwdController">
	//	<property name="changePasswordService" ref="changePwdSvc"/>
	//</bean>
	@Bean
	public ChangePwdController changePwdController() {
		ChangePwdController changePwdCtrl = new ChangePwdController();
		changePwdCtrl.setChangePasswordService(changePwdSvc);
		return changePwdCtrl;
	}
	
	//<bean class="com.spring.list.controller.MemberListController">
	//	<property name="memberDao" ref="memberDao" />
	//</bean>
	@Bean
	public MemberListController memberListController() {
		MemberListController memListCtrl = new MemberListController();
		memListCtrl.setMemberDao(memberDao);
		return memListCtrl;
	}
	
	
	//<bean class="com.spring.list.controller.MemberDetailController">
	//	<property name="memberDao" ref="memberDao" />
	//</bean>
	@Bean
	public MemberDetailController memberDetailController() {
		MemberDetailController memberDetailController = new MemberDetailController();
		memberDetailController.setMemberDao(memberDao);
		return memberDetailController;
	}
	
}
