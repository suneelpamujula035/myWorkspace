package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	private String dburl = "jdbc:mysql://localhost:3306/database1";
	private String dbuname = "root";
	private String dbpassword = "root";
	private String dbdriver = "com.mysql.cj.jdbc.Driver";
	
	public boolean validate(LoginBean loginbean)
	{
		boolean status = false;

		try
		{
			Class.forName(dbdriver);
			Connection con = DriverManager.getConnection(dburl,dbuname,dbpassword);
			
			String Query = "select * from results where rollno=? and name=?";
			PreparedStatement pst = con.prepareStatement(Query);
			pst.setInt(1, loginbean.getNumber());
			pst.setString(2, loginbean.getPassword());
			ResultSet rs = pst.executeQuery();
			status = rs.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
		
	}
}
