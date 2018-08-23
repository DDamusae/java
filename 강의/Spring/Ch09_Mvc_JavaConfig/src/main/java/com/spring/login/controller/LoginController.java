package com.spring.login.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.exception.IdPasswordNotMatchingException;
import com.spring.login.auth.AuthInfo;
import com.spring.login.auth.AuthService;
import com.spring.login.command.LoginCommand;
import com.spring.login.validator.LoginCommandValidator;

@Controller
@RequestMapping("/login")
public class LoginController {
	private AuthService authService;

	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}
	
//	@RequestMapping(method=RequestMethod.GET)
//	public String form(LoginCommand loginCommand) {
//		return "login/loginForm";
//	}
	
	//이메일 정보를 기억하고 있는 쿠키가 존재하면, 해당 쿠키의 값을 이용해서 LoginCommand 객체의 email 속성 값을 설정할 때 사용
	//@CookieValue(): 쿠키를 Cookie 파라미터로 전달 받는다
	@RequestMapping(method=RequestMethod.GET)
	public String form(LoginCommand loginCommand, @CookieValue(value="REMEMBER", required=false) Cookie rememberCookie) {
		if(rememberCookie != null) {
			loginCommand.setEmail(rememberCookie.getValue());
			loginCommand.setRememberEmail(true);
		}
		return "login/loginForm"; //쿠키값이 존재하면, email부분을 채워서 전달
	}
	
	//Session 방법1: 항상 HttpSession을 생성
	@RequestMapping(method=RequestMethod.POST)
	public String submit(LoginCommand loginCommand, Errors errors, HttpSession session, HttpServletResponse response) {
		//HttpSession을 생성하기 전이면 새로운 HttpSession을 생성하고, 그렇지 않으면 기존의 HttpSession을 전달한다.
		new LoginCommandValidator().validate(loginCommand, errors);
		if(errors.hasErrors()) {
			return "login/loginForm";
		}
		try {
			AuthInfo authInfo = authService.authenticate(loginCommand.getEmail(), loginCommand.getPassword());
			
			session.setAttribute("authInfo", authInfo);
			
			//쿠키 설정
			Cookie rememberCookie = new Cookie("REMEMBER", loginCommand.getEmail());
			rememberCookie.setPath("/");
			if(loginCommand.isRememberEmail()) {
				rememberCookie.setMaxAge(60*60*24*30);
			}else {
				rememberCookie.setMaxAge(0); //쿠키 종료
			}
			response.addCookie(rememberCookie);
			return "login/loginSuccess" ;
		}catch (IdPasswordNotMatchingException e) {
			errors.reject("idPasswordNotMatching");
			return "login/loginForm"; 
		}
	}
	
	//Session 방법2: 필요한 시점에만 HttpSession을 생성
//	@RequestMapping(method=RequestMethod.POST)
//	public String submit(LoginCommand loginCommand, Errors errors, HttpServletRequest req) {
//		HttpSession session = req.getSession();
//		new LoginCommandValidator().validate(loginCommand, errors);
//		if(errors.hasErrors()) {
//			return "login/loginForm";
//		}
//		try {
//			AuthInfo authInfo = authService.authenticate(loginCommand.getEmail(), loginCommand.getPassword());
//			session.setAttribute("authInfo", authInfo);
//			
//			return "login/loginSuccess" ;
//		}catch (IdPasswordNotMatchingException e) {
//			errors.reject("idPasswordNotMatching");
//			return "login/loginForm"; 
//		}
//	}
	
	
}
