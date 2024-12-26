package userRegistration;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegistrationDao {

	private String dburl = "jdbc:mysql://localhost:3306/database1";
	private String dbuname = "root";
	private String dbpassword = "root";
	private String dbdriver = "com.mysql.cj.jdbc.Driver";
	
	public String InsertUser(RegistrationBean rb)
	{
		
		String result = "Registration successful..";
		
		try
		{
			Class.forName(dbdriver);
			Connection con = DriverManager.getConnection(dburl,dbuname,dbpassword);
			
			String Query = "insert into member values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(Query);
			pst.setString(1, rb.getUname());
			pst.setString(2, rb.getUpassword());
			pst.setString(3, rb.getUemail());
			pst.setString(4, rb.getUphone());
			
			pst.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result = "Registration failed..";
		}
		return result;
	}
}
