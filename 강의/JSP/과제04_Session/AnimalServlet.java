

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/animal")
public class AnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String food = request.getParameter("food");
		HttpSession session = request.getSession(true);
		session.setAttribute("food", food);
		
		out.println("<html><body>");
		out.println("<h3>좋아하는 동물은? </h3>" + 
				"<form action=result>" + 
				"	<input type=text name=animal>" + 
				"	<input type=submit value=확인>" + 
				"</form>");
		out.println("</html></body>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
