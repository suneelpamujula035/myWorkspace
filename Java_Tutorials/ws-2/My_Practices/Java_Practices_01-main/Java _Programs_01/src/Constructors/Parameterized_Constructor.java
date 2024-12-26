package Constructors;

public class Parameterized_Constructor {
	
	int id;
	String name;
	double salary;
	char gender;
	
	Parameterized_Constructor(int i, String n, double sal, char gend)
	{
	id=i;
	name=n;
	salary=sal;
	gender=gend;
	}
	void display1()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(gender);
	}

	public static void main(String[] args) {
		
         
		Parameterized_Constructor p1 = new Parameterized_Constructor(5678,"Santhosh", 46611.45,'M');
		p1.display1();
		Parameterized_Constructor p2 = new Parameterized_Constructor(5618,"Mahesh", 45211.54,'M');
		p2.display1();
		Parameterized_Constructor p3 = new Parameterized_Constructor(5978,"Vasanth", 46451.89,'M');
		p3.display1();
		Parameterized_Constructor p4 = new Parameterized_Constructor(5598,"Vineeth", 59124.75,'M');
		p4.display1();



	}

}
