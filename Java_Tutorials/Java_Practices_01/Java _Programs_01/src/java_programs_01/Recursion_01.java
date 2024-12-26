package java_programs_01;

public class Recursion_01 {

	int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {

		Recursion_01 r = new Recursion_01();
		int result = r.factorial(4);
		System.out.println(result);
	}

}
