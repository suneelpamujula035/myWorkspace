package java_programs_03;

public class SwappingNumbersInSingleStatement_17 {

	public static void main(String[] args) {

		int a = 102;
		int b = 89;
		int c = 33;
		int d = 24;
		System.out.println("Before swapping  a = "+a+" b = "+b+" c= "+c+" d= "+d);
		
		a = a ^ b ^ (b = a);
		b = b ^ c ^ (c = b);
		c = c ^ d ^ (d = c);
		
		System.out.println("Before swapping  a = "+a+" b = "+b+" c= "+c+" d= "+d);
	}

}
