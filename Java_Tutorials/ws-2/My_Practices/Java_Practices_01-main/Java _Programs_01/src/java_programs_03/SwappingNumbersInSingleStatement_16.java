package java_programs_03;

public class SwappingNumbersInSingleStatement_16 {

	public static void main(String[] args) {

		int a = 102;
		int b = 89;
		System.out.println("Before swapping  a = "+a+" b = "+b);
		
		//a = a + b - (b = a);
		//a = a * b / (b = a);
		a = a ^ b ^ (b = a);
		
		System.out.println("Before swapping  a = "+a+" b = "+b);
	}

}
