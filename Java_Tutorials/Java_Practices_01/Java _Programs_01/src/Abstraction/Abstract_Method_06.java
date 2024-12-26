package Abstraction;

abstract class Vehicle87
{
	abstract int get_number_of_wheels();
}
class Bus65 extends Vehicle87
{
	public int get_number_of_wheels()
	{
		return 6;
	}
}
class Auto35 extends Vehicle87
{
	public int get_number_of_wheels()
	{
		return 3;
	}
}

public class Abstract_Method_06 {

	
	public static void main(String[] args) {
		
		Bus65 b = new Bus65();
		System.out.println(b.get_number_of_wheels());
		
		Auto35 a = new Auto35();
		System.out.println(a.get_number_of_wheels());

		

	}

}
