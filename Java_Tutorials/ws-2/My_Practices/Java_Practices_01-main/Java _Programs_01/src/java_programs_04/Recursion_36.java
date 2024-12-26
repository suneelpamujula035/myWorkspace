package java_programs_04;

public class Recursion_36 {

	int factorial(int n)
	{
		if(n>1)
		{
			return n * factorial(n-1);
		}
		else
		{
			return 1;
		}
	}
	public static void main(String[] args) {

		//Finding factorial of a number using recursion
		int x = 5;
		Recursion_36 r = new Recursion_36();
		System.out.println(r.factorial(x));
		
	}

}
