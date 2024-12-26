package servlet_pracs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Results
 */
@WebServlet("/Results")
public class Results extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int ht = Integer.parseInt(request.getParameter("ht"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localho"+ "st:3306/database1","root","root");
			String query = "select * from results where rolno="+ht;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			PrintWriter pw = response.getWriter();
			con.close();
			if(rs.next())
			{
				pw.println(rs.getInt(1));
				pw.println(rs.getString(2));
				pw.println(rs.getInt(3));
				pw.println(rs.getInt(4));
				pw.println(rs.getInt(5));
				pw.println(rs.getInt(6));
				pw.println(rs.getInt(7));
				pw.println(rs.getInt(8));
			}
			else
			{
				pw.println("Incorrect Hall ticket number");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
