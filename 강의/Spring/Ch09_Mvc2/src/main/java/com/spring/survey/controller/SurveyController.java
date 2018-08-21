package com.spring.survey.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.survey.command.AnsweredData;
import com.spring.survey.command.Question;

@Controller
@RequestMapping("/survey")
public class SurveyController {
	//방법1: Model객체를 통한 데이터 전송,return을 통한 이동
	@RequestMapping(method=RequestMethod.GET)
	public String form(Model model) {
		List<Question> questions = createQuestion();
		model.addAttribute("questions",  questions);
		return "survey/surveyForm";
		
	}
	//방법2: ModelAndView : 객체변수를 통한 전송
//	@RequestMapping(method=RequestMethod.GET)
//	public ModelAndView form2() {
//		List<Question> questions = createQuestion();
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("questions", questions);
//		mav.setViewName("survey/surveyForm");
//		return mav;
//		
//	}
	
	private List<Question> createQuestion(){
	Question q1 = new Question("당신의 역할은 무엇입니까?", Arrays.asList("서버","프론트","풀스택"));
	Question q2 = new Question("많이 사용하는 개발도구는 무엇입니까?", Arrays.asList("이클립스	","인텔리J","서브라임"));
	Question q3 = new Question("하고 싶은 말을 적어 주세요?");
		
		return Arrays.asList(q1,q2,q3);
		
	}
	//@ModelAttribute(): 1.자동으로 해당객체를 view까지 전달
	//                   2. 변수이름을 변경시 사용
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute("ansData") AnsweredData data) {
		
		return "survey/submitted";
		
	}
	
}














