package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegisterDao {

	private static String dburl = "jdbc:mysql://localhost:3306/database1";
	private static String dbuname = "root";
	private static String dbpassword = "root";
	private static String dbdriver = "com.mysql.cj.jdbc.Driver";
	
	public static void loadDriver(String dbdriver)
	{
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static Connection con = null;
	public static Connection getConnection()
	{
		
		try {
			DriverManager.getConnection(dburl,dbuname,dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public static String insert(Member member)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "Data entered successfully";
		String Query = "insert into member values(?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(Query);
			
			ps.setString(1, member.getUname());
			ps.setString(2, member.getUpassword());
			ps.setString(3, member.getUemail());
			ps.setString(4, member.getUphone());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered";
		}
		return result;
		
	}
}
