package Polymorphism;

public class Method_Overloading_01 {
	
	public static void sum()
	{
		int a = 10;
		int b = 5;
		int c = a+b;
		System.out.println(c);
	}
	public static void sum(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	public static void sum(double a, double b)
	{
		double c = a+b;
		System.out.println(c);
	}


	public static void main(String[] args) {
		sum();
		sum(50,28);
		sum(75.8,84.5);

	}

}
