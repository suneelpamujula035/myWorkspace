package hiddenFormField;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		HttpSession session = request.getSession();
		if(id.equals("1"))
		{
			String empname = request.getParameter("empname");
			String address = request.getParameter("address");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			session.setAttribute("empname", empname);
			session.setAttribute("address", address);
			session.setAttribute("email", email);
			session.setAttribute("mobile", mobile);
			
			response.sendRedirect("Bank.html");
		}
		else if(id.equals("2"))
		{
			String bankname = request.getParameter("bankname");
			String accountnumber = request.getParameter("accountnumber");
			String pannumber = request.getParameter("pannumber");
			session.setAttribute("bankname", bankname);
			session.setAttribute("accountnumber", accountnumber);
			session.setAttribute("pannumber", pannumber);
			
			//response.sendRedirect("Servlet2");
			RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
			rd.forward(request, response);
			
		}
	}

}
