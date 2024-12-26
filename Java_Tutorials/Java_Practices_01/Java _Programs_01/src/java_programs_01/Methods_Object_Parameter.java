package java_programs_01;

class Student
{
	String name="Suneel";
	int rollno=101;
	int marks=96;
}
public class Methods_Object_Parameter {

	public void results(Student stud)
	{
		System.out.println("Student name : "+stud.name);
		System.out.println("Student rollno : "+stud.rollno);
		System.out.println("Student marks : "+stud.marks);

	}
	public static void main(String[] args) {

		Methods_Object_Parameter m = new Methods_Object_Parameter();
		m.results(new Student());
	}

}
