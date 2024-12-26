package java_programs_05;

public class ConstructorChaining_05 {

	ConstructorChaining_05()
	{
		this(15);
		System.out.println("Inside default constructor");
	}
	ConstructorChaining_05(int id)
	{
		this(23.7,46);
		System.out.println("Inside int constructor");
	}
	ConstructorChaining_05(double price, int id)
	{
		System.out.println("Inside double constructor");
	}
	public static void main(String[] args) {

		ConstructorChaining_05 c = new ConstructorChaining_05();
		
	}

}
