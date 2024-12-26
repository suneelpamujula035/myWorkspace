 package date_api;

import java.util.Scanner;

public class Employee {

	int id;
	String name;
	float salary;
	
	Scanner sc = new Scanner(System.in);

	public void read()
	{
		System.out.println("Enter id");
	    id = sc.nextInt();
	    sc.nextLine();
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter salary");
		salary = sc.nextFloat();
	}
	public void calSalary()
	{
		
		float hra = 10*salary/100;
		float da = 5*salary/100;
		float pf = 7*salary/100;
//		float hra = (10/100)*salary;
//		float da = (5/100)*salary;
//		float pf = (7/100)*salary;
		
		salary = salary+hra+da-pf;
		
	}
	public void display()
	{
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("salary : "+salary);
	}
}
