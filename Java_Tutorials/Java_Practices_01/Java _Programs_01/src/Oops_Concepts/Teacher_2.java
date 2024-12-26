package Oops_Concepts;


public class Teacher_2 extends Teacher_1
{
	
	String subject = "Manufacturing Technology";

	public static void main(String[] args) {
		
		Teacher_2 obj = new Teacher_2();
		System.out.println(obj.collegename);
		System.out.println(obj.designation);
		System.out.println(obj.subject);
		obj.does();


	}

}
