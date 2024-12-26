package java_programs_01;

public class StaticAndNonStaticVariables_02 {

	// Static variable
	static int a = 10;
	// Instance or Non-static variable
	int b = 20;

	public static void abc()//Static method
	{
		System.out.println("It is a Static Method");
		System.out.println(a);
		//Instance variables can't be used in Static methods, but we can use Static and Instance variables in Non-static methods
	}

	public void abc2()//Non-Static method
	{
		System.out.println("It is a NOn-Static Method");
		System.out.println(a + b);
	}
	
	public static void abc3()
	{
		System.out.println("It is a Static Method");
		abc();//Access Static methods with Static mehods
		//abc2();//In static methods we can't call non-static methods
	}
	
	public void abc4()
	{
		System.out.println("It is a NOn-Static Method");
		abc();
		abc2();
		abc3();
	}

	public static void main(String[] args) {

		StaticAndNonStaticVariables_02 a = new StaticAndNonStaticVariables_02();
		abc();
		a.abc2();
		abc3();
		a.abc4();
	}

}
