package java_programs_03;

public class SwappingNumbersWithoutUsingThirdVariable_13 {

	public static void main(String[] args) {

		int a = 0;
		int b = 9;
		System.out.println("Before swapping  a = "+a+" b = "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Before swapping  a = "+a+" b = "+b);
	}

}
