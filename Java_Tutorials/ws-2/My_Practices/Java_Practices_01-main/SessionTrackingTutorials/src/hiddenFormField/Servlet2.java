package hiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		String empname = (String) session.getAttribute("empname");
		String address = (String) session.getAttribute("address");
		String email = (String) session.getAttribute("email");
		String mobile = (String) session.getAttribute("mobile");
		String bankname = (String) session.getAttribute("bankname");
		String accountnumber = (String) session.getAttribute("accountnumber");
		String pannumber = (String) session.getAttribute("pannumber");

		out.println("EmployeeName:"+" "+empname+"<br>");
		out.println("EmployeeAddress:"+" "+address+"<br>");
		out.println("EmployeeEmailId:"+" "+email+"<br>");
		out.println("EmployeeMobile:"+" "+mobile+"<br>");
		out.println("BankName:"+" "+bankname+"<br>");
		out.println("AccountNumber:"+" "+accountnumber+"<br>");
		out.println("PanNumber:"+" "+pannumber+"<br>");

	}

}
