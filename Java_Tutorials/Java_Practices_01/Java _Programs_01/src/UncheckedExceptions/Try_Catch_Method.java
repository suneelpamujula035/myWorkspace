package UncheckedExceptions;

public class Try_Catch_Method {

	public static void main(String[] args) {
		
		int a=10,b=0,c;
		System.out.println("Hello1");
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Don't divide by zero sir"+e);
		}
		System.out.println("Hello2");
		System.out.println("Hello3");

	}

}
