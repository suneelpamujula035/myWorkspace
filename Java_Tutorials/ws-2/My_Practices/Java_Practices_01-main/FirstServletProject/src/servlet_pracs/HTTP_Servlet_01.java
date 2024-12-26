package servlet_pracs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HTTP_Servlet_01
 */
@WebServlet("/hiiii")
public class HTTP_Servlet_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstname = request.getParameter("fname");
		String secondname = request.getParameter("sname");
		
		PrintWriter pw = response.getWriter();
		pw.println("Hiiii "+firstname+" "+secondname+" welcome to our Website");
	}

}
