package test02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pInfo")
public class personalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//서블릿
		//서블릿에서 JavaBean 객체를 생성하고 값 지정
		PersonalInfo pi = new PersonalInfo();
		pi.setName("홍길동");
		pi.setGender('남');
		pi.setAge(24);

		//request객체에 세트하고 내보냄
		request.setAttribute("pinfo", pi);
		RequestDispatcher r = request.getRequestDispatcher("test02/customerInfoViewer.jsp");
		r.forward(request, response);
	}


}
