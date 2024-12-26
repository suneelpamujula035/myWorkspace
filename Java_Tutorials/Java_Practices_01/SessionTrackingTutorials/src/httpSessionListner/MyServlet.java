package httpSessionListner;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Server at:   ").append(request.getContextPath());
		String name = request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		
		out.println("Total Logged in user "+MyListner.totalcount());
		out.println("Total Logged in user "+MyListner.currentcount());

		out.println("<a href='./Logout'></a>");
	}

}
