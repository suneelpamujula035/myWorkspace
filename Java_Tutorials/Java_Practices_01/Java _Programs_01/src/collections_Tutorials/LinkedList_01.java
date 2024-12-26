package collections_Tutorials;

import java.util.Collection;
import java.util.LinkedList;

class Student1
{
	int id;
	public Student1(int id)
	{
		super();
		this.id = id;
	}
	
}
public class LinkedList_01 {

	public static void main(String[] args)
	{
		Student1 s1 = new Student1(101);
		Student1 s2 = new Student1(102);
		Student1 s3 = new Student1(103);
		Student1 s4 = new Student1(104);
		Student1 s5 = new Student1(105);
		Student1 s6 = new Student1(106);

		LinkedList<Student1> list = new LinkedList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(new Student1(650));
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		for(Student1 x:list)
		{
			System.out.println(x.id);
		}
		
	}
}

