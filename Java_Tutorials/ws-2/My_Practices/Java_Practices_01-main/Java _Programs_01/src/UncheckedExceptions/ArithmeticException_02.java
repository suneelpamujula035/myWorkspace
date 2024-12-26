package UncheckedExceptions;
class A
{
	public void m1()
	{
		System.out.println("Program started");
		int a[]=new int[4];
		
		try
		{
			a[7]=12;
		}
		catch(Exception e)
		{
			System.out.println(e+e.getMessage());
		}
		finally
		{
			System.out.println("Program is in progress");
		}
		System.out.println("Program exited");
	}
}
class B extends A
{
	public void m2()
	{
		System.out.println("Program started");
		
		String s = null;
		try
		{
			System.out.println(s.length());
		}
		catch(Exception g)
		{
			System.out.println(g+g.getMessage());
		}
		System.out.println("Hello Everyone");
	}
}

public class ArithmeticException_02 {

	public static void main(String[] args) {
		
		B a = new B();
		a.m1();
		a.m2();

	}

}
