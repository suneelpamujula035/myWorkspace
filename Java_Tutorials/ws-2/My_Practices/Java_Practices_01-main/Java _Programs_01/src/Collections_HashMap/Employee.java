package Collections_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Employee {
	
	String name;
	int age;
	String dept;
	double hike;
	
	Employee(String name,int age,String dept,double hike)
	{
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.hike = hike;
	}

	public static void main(String[] args) {

		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("Tom", 25, "admin",25.6);
		Employee e2 = new Employee("John", 35, "QA",24.8);
		Employee e3 = new Employee("Steve", 37, "HR",28.32);
		Employee e4 = new Employee("Jack", 24, "Developer",18.26);
		Employee e5 = new Employee("Peter", 46, "Tester",14.58);
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);
		emp.put(5, e5);
		
		System.out.println(emp.size());
		
		for(Entry<Integer, Employee> t : emp.entrySet())
		{
			t.getKey();
			Employee e = t.getValue();
			//System.out.println(Key + "Info");
			System.out.println(e.name+"  "+e.age+"  "+e.dept+"  "+e.hike);
		}

		

	}

}
