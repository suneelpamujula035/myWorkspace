package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LOGOUTservlet
 */
@WebServlet("/LOGOUTservlet")
public class LOGOUTservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		request.getRequestDispatcher("Link.html").include(request, response);
		
		Cookie ck = new Cookie("name", "");
		ck.setMaxAge(0);
		response.addCookie(ck);
		out.println("Logged out successfully");
	}

}
