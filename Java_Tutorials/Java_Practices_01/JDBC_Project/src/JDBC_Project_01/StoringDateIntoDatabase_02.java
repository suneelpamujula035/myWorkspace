package JDBC_Project_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StoringDateIntoDatabase_02 {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your date of birth : (dd-mm-yyyy)");
		String dob = sc.next();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		java.util.Date dob1 = sdf.parse(dob);
		System.out.println(dob1);
		long dob2 = dob1.getTime();
		java.sql.Date dob3 = new java.sql.Date(dob2);
		System.out.println(dob3);
		sc.close();
	}

}
