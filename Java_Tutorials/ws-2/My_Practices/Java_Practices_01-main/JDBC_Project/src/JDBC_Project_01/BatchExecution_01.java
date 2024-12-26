package JDBC_Project_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchExecution_01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://192.168.43.229:3306/database1","root","root");
		PreparedStatement pst = con.prepareStatement("insert into studentdata values(?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter student number");
			int sno = sc.nextInt();
			System.out.println("Enter student name");
			String name  = sc.next();
			System.out.println("Enter student gender");
			String gender = sc.next();
			System.out.println("Enter student age");
			int age = sc.nextInt();
			
			pst.setInt(1, sno);
			pst.setString(2, name);
			pst.setString(3, gender);
			pst.setInt(4, age);
			pst.addBatch();
			System.out.println("Records inserted sucessfully");
			System.out.println("Do you want yo instal one more recore? [Yes/No]");
			String option = sc.next();
			
			if(option.equalsIgnoreCase("NO"))
			{
				break;
			}
		}
		pst.executeBatch();
		System.out.println("Batch of records added successfully");
		sc.close();
		con.close();
	}
	
	//BatchExecution uses only for non-select queries (insert,update,delete)

}
