package UncheckedExceptions;

public class Try_Catch_Finally_Method {

	public static void main(String[] args) {
		
		int a=5,b=0,c;
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Don't divide by zero sir"+e);
		}
		finally
		{
			System.out.println("Im printed definitely");
		}
		System.out.println("Hello1");
		System.out.println("Hello2");
		
		//1. Exception occurs, catch block handles, finally block also execute.
		//2. Exception not occurs, catch block not handles, finally block also execute.
		//3. Exception not occurs, catch block will ignore, finally block also execute.


		


	}

}
