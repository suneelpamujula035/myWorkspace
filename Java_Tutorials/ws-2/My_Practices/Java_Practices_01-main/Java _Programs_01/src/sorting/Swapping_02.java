package sorting;

public class Swapping_02 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("Before swapping");
		System.out.println("a is :"+a+" b is :"+b);
		
		a = a+b;//10+20=30
		b = a-b;//30-20=10
		a = a-b;//30-10=20
		
		System.out.println("After swapping");
		System.out.println("a is :"+a+" b is :"+b);
	}

}
