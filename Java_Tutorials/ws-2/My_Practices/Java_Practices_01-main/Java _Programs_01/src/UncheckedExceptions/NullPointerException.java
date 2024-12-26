package UncheckedExceptions;

public class NullPointerException {

	public static void main(String[] args) {
		
		String s= null;
		System.out.println("Program started");
		
		try
		{
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Please enter the text   "+e);
		}
		System.out.println("Program exited");
		

	}

}
