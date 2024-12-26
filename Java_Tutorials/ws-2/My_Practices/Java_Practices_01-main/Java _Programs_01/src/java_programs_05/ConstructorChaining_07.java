package java_programs_05;

public class ConstructorChaining_07 {

	ConstructorChaining_07()
	{
		System.out.println("Inside default constructor");
	} 
	ConstructorChaining_07(int id)
	{
		this();
		//this(25.84);//Constructor call must be the first statement in a constructor
		System.out.println("Inside int constructor");
	}
	ConstructorChaining_07(double price)
	{
		System.out.println("Inside double constructor");
	}
	public static void main(String[] args) {

		ConstructorChaining_07 c = new ConstructorChaining_07(23);
		
	}

}
