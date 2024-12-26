package servlet_pracs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome2
 */
@WebServlet("/Welcome2")
public class Welcome2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Email2 = request.getParameter("Email1");
		String Password2 = request.getParameter("Password1");
		String Phone2 = request.getParameter("Phone1");
		String Age2 = request.getParameter("Age1");
		String Country2 = request.getParameter("Country1");
		
		PrintWriter pw = response.getWriter();
		pw.println(Email2);
		pw.println(Password2);
		pw.println(Phone2);
		pw.println(Age2);
		pw.println(Country2);
	}

}
