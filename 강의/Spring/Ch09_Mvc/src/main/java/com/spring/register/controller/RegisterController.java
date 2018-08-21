package com.spring.register.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.register.command.RegisterRequest;
import com.spring.register.service.MemberRegisterService;

@Controller
public class RegisterController {
	
	private MemberRegisterService memberRegisterService;
	
	public void setMemberRegisterService(MemberRegisterService memberRegisterService) {
		this.memberRegisterService = memberRegisterService;
	}
	
	@RequestMapping("/register/step1")
	public String handleStep1() {	
		return "register/step1" ;	//  /WEB-INF/views/register/step1.jsp
	}
	
	@RequestMapping(value="/register/step2", method=RequestMethod.POST)
	public String handleStep2(@RequestParam(value="agree",defaultValue="false") Boolean agree, Model model) {
		if(!agree) {//agree =true
			return "register/step1";
		}
		model.addAttribute("registerRequest", new RegisterRequest());
		return "register/step2" ;	//  
	}
	//@RequestParam(): parameter로 넘어 오는 값을 저장 
	//요청이 Post방식이므로 예외가 발생하지만, step1으로 redirect 설정
	@RequestMapping(value="/register/step2", method=RequestMethod.GET)
	public String handleStep2Get(@RequestParam(value="agree",defaultValue="false") Boolean agree, Model model) {
		
		return "redirect:step1" ;	// 
	}
	
//	@RequestMapping(value="/register/step2", method=RequestMethod.GET)
//	public String handleStep22Get(HttpServletRequest request, Model model) {
//	    String agreeParam =	request.getParameter("agree");
//	    if(agreeParam == null || !agreeParam.equals("true")) {
//	    	return "redirect:step1";
//	    }
//	    model.addAttribute("agreeParam", agreeParam);
//		return "redirect:step2" ;	// 
//	}
	
	
	//Command객체: 파라미터로 오는 내용들을 set()를 통해서 저장 예)RegisterRequest
	//작성방법1
	@RequestMapping(value="/register/step3", method=RequestMethod.POST)
	public String handleStep3(RegisterRequest regReq) {
		try {
			memberRegisterService.regist(regReq);
			return "register/step3" ;//소문자 변수로 step3.jsp에서 사용(RegisterRequest)
		} catch (Exception e) {
			return "register/step2";
		}	// 
	}
	//작성방법2
//	@RequestMapping(value="/register/step3", method=RequestMethod.POST)
//	public String handleStep3(HttpServletRequest request) {
//		String email = request.getParameter("email");
//		String name = request.getParameter("name");
//		String password = request.getParameter("password");
//		String confirmPassword = request.getParameter("confirmPassword");
//		
//		RegisterRequest regReq = new RegisterRequest();
//		regReq.setEmail(email);
//		regReq.setName(name);
//		regReq.setPassword(password);
//		regReq.setConfirmPassword(confirmPassword);
//		
//		return "register/step3" ;	// 
//	}
	
	//@ModelAttribute("formData") RegisterRequest :step3에서 전달할 변수이름이 registerRequest => formData로 변경됨
//	@RequestMapping(value="/register/step3", method=RequestMethod.POST)
//	public String handleStep33(@ModelAttribute("formData") RegisterRequest regReq) {
//		try {
//			memberRegisterService.regist(regReq);
//			return "register/step3" ;//소문자 변수로 step3.jsp에서 사용(RegisterRequest)
//		} catch (Exception e) {
//			return "register/step2";
//		}	// 
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
