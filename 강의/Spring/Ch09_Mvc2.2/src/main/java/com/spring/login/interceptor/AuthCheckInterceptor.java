package com.spring.login.interceptor;

//HandlerInterceptor Class
// : 다수의 컨트롤러에 대해서 동일한 기능을 적용할때 사용
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthCheckInterceptor extends HandlerInterceptorAdapter {
	// 컨트롤러/핸들러 객체를 실행하기전에 필요한 기능을 구현할때 사용
	// (예)로그인 하지 않은 경우 컨트롤러/핸들러를 실행 하지 않는다.
	// 컨트롤러를 실행하기 전에 컨트롤러에서 필요한 기능을 수행
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		if (session != null) {
			Object authInfo = session.getAttribute("authInfo");
			if (authInfo != null)
				return true;// 컨트롤러 실행
		}
		response.sendRedirect(request.getContextPath() + "/login");
		return false;// 로그인 상태가 아니므로 지정한 경로로 redirect
	}

	// 컨트롤러/핸들러가 정상적으로 실행된 후에 추가 기능을 구현할때 사용
	// 컨트롤러가 Exception이 발생하면 postHandle() 실행 되지 않음
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		super.postHandle(request, response, handler, modelAndView);
	}

	// View가 Client에 응답을 전송한 뒤에 실행
	// 예)실행 이후에 Exception 발생하는 경우, 실행시간을 기록하는 경우등
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		super.afterCompletion(request, response, handler, ex);
	}
}
