package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 String dburl = "jdbc:mysql://localhost:3306/database1";
	 String dbuname = "root";
	 String dbpassword = "root";
	 String dbdriver = "com.mysql.cj.jdbc.Driver";
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try
		{
			Class.forName(dbdriver);
			Connection con = DriverManager.getConnection(dburl,dbuname,dbpassword);
			String Query = "select * from user_registration where Email=? and Password=?";
			PreparedStatement pst = con.prepareStatement(Query);
			pst.setString(1, email);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())          // Valid User -----------> Welcome Servlet
			{
				request.setAttribute("output", rs);
				//ServletContext sc = getServletContext();
				RequestDispatcher rd = request.getRequestDispatcher("/WelcomeServlet");
				rd.forward(request, response);
			}
			else                  // Invalid User ------------> Login html page
			{
				//response.setContentType("text/html");
				PrintWriter pw = response.getWriter();
				pw.println("Invaid Username or Password");
				//ServletContext sc = getServletContext();
				RequestDispatcher rd = request.getRequestDispatcher("RequestDispatcher.html");
				rd.include(request, response);
				
				//We can use ServletContext and request any where in the program
				//RequestDispatcher works when the Servlets are in the same project
				//RequestDispatcher doesn't work when the Servlets are in different projects or different servers
			}
		}
		catch(Exception e)
		{
			
		}

	}

}
