package UncheckedExceptions;

public class MultipleCatch {
	
	public static void MultipleCatchException()
	{
		int a=12,b=0;
		int r[]=new int[5];
		String s =null;
		
		try
		{
			int c =a/b;
			r[8]=26;
			System.out.println(c);
			System.out.println(r);
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("We can't divide by zero  "+e);
		}
		finally
		{
			System.out.println("Program exited");
		}
	}
	public static void main(String[] args) {
		MultipleCatchException();
		

	}

}
