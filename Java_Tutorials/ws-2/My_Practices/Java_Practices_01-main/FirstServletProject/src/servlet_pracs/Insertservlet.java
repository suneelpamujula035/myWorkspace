package servlet_pracs;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insertservlet
 */
@WebServlet("/Insertservlet")
public class Insertservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int sno = Integer.parseInt(request.getParameter("sno"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		double percentage = Double.parseDouble(request.getParameter("percentage"));

		PrintWriter pw = response.getWriter();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
			String Query = "insert into student4 values("+sno+",'"+name+"',"+age+",'"+percentage+"')";
			Statement st = con.createStatement();
			st.executeUpdate(Query);
			
			pw.println("Record is inserted");
		}
		catch(Exception e)
		{
			System.out.println(e+e.getMessage());
		}
		
		pw.close();
		
	}

}
