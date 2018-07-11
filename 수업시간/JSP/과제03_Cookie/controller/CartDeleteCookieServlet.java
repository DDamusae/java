package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CartDeleteCookie")
public class CartDeleteCookieServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();

		Cookie[] c = request.getCookies();
		if(c != null && c.length>0){
			for(int i=0; i<c.length; i++){
				Cookie c2 = new Cookie(c[i].getName(), "");
				c2.setMaxAge(0);
				response.addCookie(c2);
			}
		}
		
		out.println("장바구니 비웠음!!");
		out.println("<a href=\"test03/cookie.html\">상품 선택 페이지</a><br>");

	}
}


