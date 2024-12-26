package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LOGINservlet
 */
@WebServlet("/LOGINservlet")
public class LOGINservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		request.getRequestDispatcher("Link.html").include(request, response);
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if(password.equals("admin123"))
		{
			out.println("Login successfull");
			out.println("<b>Welcome </b>"+name);
			
			Cookie ck = new Cookie("output", name);
			response.addCookie(ck);
		}
		else
		{
			out.println("Sorry invalid username or password");
			request.getRequestDispatcher("Login.html").include(request, response);
			
		}
	}

}
