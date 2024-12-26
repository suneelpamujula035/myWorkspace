package java_programs_02;

import java.util.Scanner;

public class Enter_Your_Details {

	public static void main(String[] args) {
		
		System.out.println("----------Enter your details------------");
		
		Scanner gh=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=gh.next();
	
		System.out.println("Name: "+name);
		
		System.out.println("Enter your age");
		int age=gh.nextInt();
		System.out.println("Age: "+age);
		
		System.out.println("Enter your salary");

		double salary=gh.nextDouble();
		System.out.println("Salary: "+salary);
		gh.close();
		
	}

}
