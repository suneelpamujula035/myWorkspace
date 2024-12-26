package UncheckedExceptions;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		System.out.println("Program started");
		try
		{
			a[8]=2;
		}
		catch(Exception e)
		{
			System.out.println(e+e.getMessage());
		}
		finally
		{
			System.out.println("im printed definetly");
		}
		System.out.println("Hello1");
		System.out.println("Hello2");

	}

}
