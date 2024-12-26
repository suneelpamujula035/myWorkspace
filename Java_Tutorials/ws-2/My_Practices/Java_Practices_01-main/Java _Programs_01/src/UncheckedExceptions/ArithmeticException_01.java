package UncheckedExceptions;

import UncheckedExceptions.Demo.B54;

class Demo
{
	void display()
	{
		System.out.println("Program started");
		try
		{
			int a= 15/0;
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("We can't divide by zero"+e);
		}
		//System.out.println("Program exited");
	}
class B54 extends Demo
	{
		void display1()
		{
			int a[]=new int[5];

			try
			{
				 a[8]=42;
			}
			catch(Exception e)
			{
				System.out.println(e+e.getMessage());
			}
			System.out.println("Program exited for ArrayIndexOutOfBoundsException");
		}
	}
}

public class ArithmeticException_01 {

	public static void main(String[] args)
	{
		
//		B54 d = new B54();
//		d.display();
//		d.display1();

	}

}

