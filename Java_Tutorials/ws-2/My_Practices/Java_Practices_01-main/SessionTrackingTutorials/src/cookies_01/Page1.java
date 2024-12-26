package cookies_01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page1
 */
@WebServlet("/Page1")
public class Page1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("n1");
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		pw.println("Welcome "+name);
		
		Cookie cookie = new Cookie("username", name);//name and value pair or key and value pair
		response.addCookie(cookie);
		
		//Creating submit button
		pw.println("<form action=\"Page2\" method=\"post\">");
		pw.println("<input type=\"submit\" value=\"Go\">");
		pw.println("</form>");
	}

}
