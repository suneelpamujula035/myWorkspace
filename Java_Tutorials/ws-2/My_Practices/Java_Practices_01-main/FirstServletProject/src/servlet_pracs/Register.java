package servlet_pracs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Driver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/hello")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
		   
		PrintWriter out = response.getWriter();
		
		String n=request.getParameter("userName");  
		String p=request.getParameter("userPass");  
		String e=request.getParameter("userEmail");  
		String c=request.getParameter("userCountry");  
		          
		try
		{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");  
		Statement st = con.createStatement();
		String query = "insert into registeruser values('"+n+"','"+p+"','"+e+"','"+c+"',)";
		st.executeUpdate(query);
		out.println("Success");
//		PreparedStatement ps=con.prepareStatement("insert into registeruser values(?,?,?,?)");  
//		
//		ps.setString(1,'"+n+"');  
//		ps.setString(2,p);  
//		ps.setString(3,e);  
//		ps.setString(4,c);  
		          
		//st.executeUpdate();  
		/*
		 * if(i==0) { out.println("Registration failed"); } else {
		 * out.println("You are successfully registered..."); }
		 */
		out.println("Registration successfull");
		}
		catch (Exception e2) 
		{
			System.out.println(e2);
		} 
		          
		out.close();
	}

}
