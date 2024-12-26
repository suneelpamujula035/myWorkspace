package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("./reg")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		int sage = Integer.parseInt(request.getParameter("sage"));
		String semail = request.getParameter("semail");
		String smobile = request.getParameter("smobile");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Durga Software Solutions</h2>");
		out.println("<h3>Student registration form</h3>");
		out.println("<table border = '1px' cellspacing='10px' cellpadding='0px'>");
		
		out.println("<tr><td>Student Id</td><td>"+sid+"</td></tr>");
		out.println("<tr><td>Student Name</td><td>"+sname+"</td></tr>");
		out.println("<tr><td>Student Age</td><td>"+sage+"</td></tr>");
		out.println("<tr><td>Student Email</td><td>"+semail+"</td></tr>");
		out.println("<tr><td>Student Mobile</td><td>"+smobile+"</td></tr>");

		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

	}

}
