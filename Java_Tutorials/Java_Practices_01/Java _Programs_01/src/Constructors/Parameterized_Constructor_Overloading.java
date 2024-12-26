package Constructors;

public class Parameterized_Constructor_Overloading {
	
	int age;
	String name;
	int salary;
	double hike;
	
	Parameterized_Constructor_Overloading(int a)
	{
		age=a;
	}
	Parameterized_Constructor_Overloading(int a,String s)
	{
		age=a;
		name=s;
	}
	Parameterized_Constructor_Overloading(int a, String n, int s, double h)
	{
		age=a;
		name=n;
		salary=s;
		hike=h;
	}
	public void display2()
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(hike);
	}

	public static void main(String[] args) {
		
		
		Parameterized_Constructor_Overloading c1 = new Parameterized_Constructor_Overloading(52);
		c1.display2();
		Parameterized_Constructor_Overloading c2 = new Parameterized_Constructor_Overloading(42, "Fahim");
		c2.display2();
		Parameterized_Constructor_Overloading c3 = new Parameterized_Constructor_Overloading(28, "Gulam", 45000,28.65);
		c3.display2();
		
		
	}

}
