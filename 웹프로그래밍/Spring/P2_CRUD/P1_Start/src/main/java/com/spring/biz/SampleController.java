package com.spring.biz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.ProductVO;

@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	//1.void 리턴타입인 경우
	@RequestMapping("doA")
	public void doA(){
		logger.info("doA Call~~~~");
	}
	@RequestMapping("doB")
	public void doB(){
		logger.info("doB Call~~~~");
	}
	//2.String이 리턴타입인 경우: 파리미터로 값을 넘겨야 한다.doC?msg=hong
	//@ModelAttribute("msg"): 저장객체,자동으로 해당객체를 View에 전달
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String msg){
		logger.info("doC Call ModelAttribute~~~");
		return "result";
	}
	//3.만들어진 결과 데이터를 전달해야 하는 경우(Model)
	@RequestMapping("doD")
	public String doD(Model model){
		ProductVO product = new ProductVO("Sample Product", 10000);
		logger.info("doD Call Model~~~");
		model.addAttribute(product);//전달할 객체이름은 소문자로 시작(productVO)
		model.addAttribute("product2",product);//
		return "productDetail";//  "/WEB-INF/views/productDetail.jsp"
	}
	//4.redirect를 해야하는 경우
	//RedirectAttributes: 임시로 추가해서 전달,주소파라미터에는 보이지 않음
	@RequestMapping("doE")
	public String doE(RedirectAttributes rttr){
		logger.info("doE Call RedirectAttributes~~~");
		rttr.addFlashAttribute("msg", "This is the doE Message~~~");//임시데이터 전달
		return "redirect:/doF";
	}
	//doE에서 redirect로 전달 받을때 @ModelAttribute 로받음
	@RequestMapping("/doF")
	public void doF(@ModelAttribute("msg") String msg){
		logger.info("doF Call ~~~" + msg);
	}
	
	//5. JSON데이터를 생성하는 경우: pom.xml(jackson-databind)
	//@ResponseBody : 리턴타입이 응답메시지로 전송
	//chrome에서 테스트 해야함.
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON(){
		ProductVO vo = new ProductVO("샘플상품", 3000);
		return vo;	
	}
}
