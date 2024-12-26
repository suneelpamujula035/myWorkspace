package Constructors;

public class Copy_Constructor {
	int age;
	String name;
	int salary;
	double hike;
	
	Copy_Constructor(int a, String n, int s, double h)
	{
		age=a;
		name=n;
		salary=s;
		hike=h;
	}
	Copy_Constructor(Copy_Constructor t)
	{
		age=t.age;
		name=t.name;
		salary=t.salary;
		hike=t.hike;
	}
	public void display3()
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(hike);
	}

	public static void main(String[] args) {
		
		Copy_Constructor c1 = new Copy_Constructor(29,"Pawan",25000,22.59);
		c1.display3();
		Copy_Constructor c2 = new Copy_Constructor(c1);
		c2.display3();
		

	}

}
