package UncheckedExceptions;

public class ArithmeticException {

	public static void main(String[] args) {
		System.out.println("Program started");
		
		int a=15,b=0,c;
		
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(Exception f )
		{
			System.out.println("We can't divide by zero   "+f);
			//System.err.println("Error"+f); Then Error will be display in red color

		}
		System.out.println("Program exited");

	}

}
