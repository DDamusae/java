package config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//@EnableWebMvc가 <mvc:annotation-driven/>를 대신한다

@Configuration
@EnableWebMvc
public class MvcConfig extends WebMvcConfigurerAdapter {
	//WebMvcConfigurerAdapter가 <mvc:annotation-driven/>, <mvc:default-servlet-handler />, <mvc:view-controller>를 대신한다.
	
	//<mvc:default-servlet-handler />
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	//<mvc:view-resolvers><mvc:jsp prefix="/WEB-INF/views/" /></mvc:view-resolvers>
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp().prefix("/WEB-INF/views/");
	}
	
	
	
//	<bean id="messageSource" class="org.springframework.context.support.ResourceBundleMessageSource">
//		<property name="basenames">
//			<list>
//				<value>message.label</value>
//			</list>
//		</property>
//		<property name="defaultEncoding" value="utf-8"></property>
//	</bean>
	
	//위의 bean의 id값을 메소드 이름으로 사용해야 한다. (사용할 id값을 메소드 이름으로 사용)
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource msgSrc = new ResourceBundleMessageSource();
		msgSrc.setBasenames("message.label");
		msgSrc.setDefaultEncoding("utf-8");
		return msgSrc;
	}
	
	
	
	
	
	
	
	
}
