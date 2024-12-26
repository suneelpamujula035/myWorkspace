package results;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.LoginBean;

/**
 * Servlet implementation class Results
 */
@WebServlet("/Results")
public class Results extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Results() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int number = Integer.parseInt(request.getParameter("number"));
		
		 String dburl = "jdbc:mysql://localhost:3306/database1";
		 String dbuname = "root";
		 String dbpassword = "root";
		 String dbdriver = "com.mysql.cj.jdbc.Driver";


			try
			{
				Class.forName(dbdriver);
				Connection con = DriverManager.getConnection(dburl,dbuname,dbpassword);
				
				String Query = "select * from results where rollno=?";
				PreparedStatement pst = con.prepareStatement(Query);
				pst.setInt(1, number);
				ResultSet rs = pst.executeQuery();
				PrintWriter pw = response.getWriter();
				if(rs.next())
				{
					pw.println("Hallticket Number:"+rs.getInt(1));
					pw.println("Name:"+rs.getString(2));
					pw.println("Telugu:"+rs.getInt(3));
					pw.println("Hindi:"+rs.getInt(4));
					pw.println("English:"+rs.getInt(5));
					pw.println("Maths:"+rs.getInt(6));
					pw.println("Science:"+rs.getInt(7));
					pw.println("Social:"+rs.getInt(8));
				}
				else
				{
					pw.println("Invalid Hallticket number");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			

	}
}
