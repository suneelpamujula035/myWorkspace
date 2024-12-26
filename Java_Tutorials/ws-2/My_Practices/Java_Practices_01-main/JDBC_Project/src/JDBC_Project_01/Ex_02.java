package JDBC_Project_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Ex_02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student1");
		System.out.println("sn"+"   "+"fname");
		while(rs.next())
		{
		//System.out.println(rs.getInt("sn")+"   "+rs.getString("fname"));
		System.out.println(rs.getString("sn")+"   "+rs.getString("fname"));
		//System.out.println(rs.getInt(1)+"     "+rs.getString(2));
		}
		con.close();
	}

}
