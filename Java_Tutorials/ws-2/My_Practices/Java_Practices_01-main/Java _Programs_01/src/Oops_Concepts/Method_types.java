package Oops_Concepts;

public class Method_types {
	
	public static void method_without_parameters()
	{
		System.out.println("Example for method without parameters");
	}
	//public static method_with_parameters()
	public static void display(String name1,String name2)
	{
		System.out.println(name1);
		System.out.println(name2);
	}
	//public static void method_without_parameters and return type
	public static int sum()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	//public static method with parameters and return type
	public static int sum(int a, int b)
	{
		int c = a*b;
		return c;
	}

	public static void main(String[] args) {
		method_without_parameters();
		display("suneel", "kumar");
		int d = sum();
		{
			System.out.println(d);
		}
		int c = sum(10,20);
		{
			System.out.println( c);
		}

	}

}
