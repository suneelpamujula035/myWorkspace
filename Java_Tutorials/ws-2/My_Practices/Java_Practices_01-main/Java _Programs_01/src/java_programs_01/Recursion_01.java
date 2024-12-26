package java_programs_01;

public class Recursion_01 {

	int factorial(int n)
	{
		if(n==1)
		return 1;
		int x=n*factorial(n-1);
		return x;
	}
	public static void main(String[] args) {

		Recursion_01 r = new Recursion_01();
		int result = r.factorial(5);
		System.out.println(result);
	}

}
