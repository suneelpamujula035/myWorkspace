package JDBC_Project_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StoringDateIntoDatabase_03 {

	public static void main(String[] args) throws ParseException, ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
		String query = "insert into dateofbirth values(?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter your name");
			String name = sc.next();
			System.out.println("Enter your date of birth : [dd-mm-yyyy]");
			String dob = sc.next();
			
			pst.setString(1, name);
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
			java.util.Date dob1 = sdf.parse(dob);
			long dob2 = dob1.getTime();
			java.sql.Date dob3 = new java.sql.Date(dob2);
			
			pst.setDate(2, dob3);
			pst.execute();
			
			System.out.println("Records inserted");
			System.out.println("If you want to insert one more record  [Yes/No]");
			String option = sc.next();
			if(option.equalsIgnoreCase("NO"))
			{
				break;
			}
		}
		con.close();
		sc.close();
	}

}
