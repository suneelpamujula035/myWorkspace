package java_programs_07;

public class NullArguments_17 {

	public static void test(Object o)
	{
		System.out.println("Object Arguments");
	}
	public static void test(String s)
	{
		System.out.println("String Arguments");
	}
	public static void main(String[] args) {

		test(null);//String Arguments
	}

}
