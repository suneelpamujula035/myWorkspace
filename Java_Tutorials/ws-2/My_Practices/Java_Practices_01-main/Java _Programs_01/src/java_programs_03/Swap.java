package java_programs_03;

public class Swap {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("Before swapping : a="+a+" b="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		a=a+b-(b=a);
//		a=a*b/(b=a);
		System.out.println("After swapping : a="+a+" b="+b);
	}

}
