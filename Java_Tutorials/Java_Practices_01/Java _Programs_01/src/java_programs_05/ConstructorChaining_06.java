package java_programs_05;

public class ConstructorChaining_06 {

	ConstructorChaining_06()
	{
		//this(15);
		System.out.println("Inside default constructor");
	}
	ConstructorChaining_06(int id)
	{
		//this(23.7);
		System.out.println("Inside int constructor");
	}
	ConstructorChaining_06(double price)
	{
		this();//Recursive constructor invocation error
		System.out.println("Inside double constructor");
	}
	public static void main(String[] args) {

		ConstructorChaining_06 c = new ConstructorChaining_06();
		
	}

}
