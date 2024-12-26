package UncheckedExceptions;

import java.util.Scanner;

public class NumberFormatException {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sun = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter 2 numbers");
			a = Integer.parseInt(sun.next());
			b = Integer.parseInt(sun.next());
		}
		catch(Exception e)
		{
			System.out.println("Can not be converted to integer   "+e+e.getMessage());
		}
		finally
		{
			System.out.println("Please wait");
		}
		System.out.println("Program Exited");

	}

}
