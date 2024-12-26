package Collections_ArrayList;

import java.util.ArrayList;

public class Student {
	
	int  rollno;
	String name;
	int marks;
	long phone;
	char grade;
	
	Student(int r,String n,int m,long p,char g)
	{
		this.rollno=r;
		this.name=n;
		this.marks=m;
		this.phone=p;
		this.grade=g;
	}

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(101,"Ashok",68,5555555555L,'D');
		Student s2 = new Student(102,"Prasanth",75,55555555,'C');
		Student s3 = new Student(103,"Kiran",83,5899555,'B');
		Student s4 = new Student(104,"Vineeth",52,55555,'E');
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("list of Students : "+al.size());
		System.out.println(al);
		
		for(Student s:al)
		{
			System.out.println(s.rollno+" "+s.name+" "+s.marks+" "+s.phone+" "+s.grade);
		}

		

	}

}
