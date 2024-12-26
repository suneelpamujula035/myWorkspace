package JDBC_Project_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement_01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
		PreparedStatement pst = con.prepareStatement("insert into student3 values(?,?,?)");
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter student number");
			int sno = sc.nextInt();
			System.out.println("Enter student name");
			String name  = sc.next();
			System.out.println("Enter student city");
			String city = sc.next();
//			System.out.println("Enter student postalcode");  13197
//			int postalcode = sc.nextInt();
			
			pst.setInt(1, sno);
			pst.setString(2, name);
			pst.setString(3, city);
			//pst.setInt(4, postalcode);
			pst.executeUpdate();
			System.out.println("Records inserted sucessfully");
			System.out.println("Do you want to add one more record? [Yes/No]");
			String option = sc.next();
			
			if(option.equalsIgnoreCase("NO"))
			{
				break;
			}
		}
		con.close();
	}

}
