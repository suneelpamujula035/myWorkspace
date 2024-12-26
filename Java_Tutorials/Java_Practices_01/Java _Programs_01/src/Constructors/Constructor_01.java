package Constructors;

public class Constructor_01 {
	
	public String name;
	public int age;
	public int salary;
	public int id;
	

	public Constructor_01(String na, int ag, int sal, int i) {

		name = na;
		age = ag;
		salary = sal;
		id = i;
	}
	public Constructor_01()
	{
		System.out.println("Default constructor called");
	}

	public static void main(String[] args) {

		Constructor_01 con = new Constructor_01("Suneel",23,35000,302);
		System.out.println(con.name);
		System.out.println(con.age);
		System.out.println(con.salary);
		System.out.println(con.id);
		
		Constructor_01 b = new Constructor_01("Pawan", 25, 42000, 440);
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(b.salary);
		System.out.println(b.id);
		
		Constructor_01 c = new Constructor_01();
	}
}
