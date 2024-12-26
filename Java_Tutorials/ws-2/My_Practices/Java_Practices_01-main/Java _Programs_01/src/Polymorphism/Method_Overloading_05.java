package Polymorphism;

public class Method_Overloading_05 
{
	
	void sum()               //First method
	{
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	void sum(int x, int y)    //Second method
	{
		int a = x;
		int b = y;
		System.out.println(a+b);
	}
	void sum(int x, int y, int z)  //Third method
	{
		System.out.println(x+y+z);
	}
	void sum(int x, double y)  //Fourth method
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		Method_Overloading_05 m1 = new Method_Overloading_05();
		m1.sum();
		m1.sum(25, 23);
		m1.sum(10, 20, 30);
		m1.sum(20, 4.5);

	}

}
