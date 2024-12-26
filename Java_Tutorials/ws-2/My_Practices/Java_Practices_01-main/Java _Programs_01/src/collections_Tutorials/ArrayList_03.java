package collections_Tutorials;

import java.util.ArrayList;
import java.util.List;

class Student
{
	int rollno;
	String name;
	String Address;
	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.Address = address;
	}
}
public class ArrayList_03 {
	public static void main(String[] args) {

		Student s1 = new Student(1, "Suneel", "Nellore");
		Student s2 = new Student(2, "Naresh", "Vijiyawada");
		Student s3 = new Student(3, "Lokesh", "Hyderabad");
		Student s4 = new Student(4, "Santhosh", "Banglore");
		Student s5 = new Student(5, "Mahesh", "Noida");

		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(new Student(6,"Bhargavi","Chennai"));

		for(Student s:list)
		{
			System.out.println(s.rollno+"    "+s.name+"    "+s.Address);
		}
	}

}
