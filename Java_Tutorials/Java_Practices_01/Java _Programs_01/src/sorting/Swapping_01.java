package sorting;

public class Swapping_01 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("Before swapping");
		System.out.println("a is :"+a+" b is :"+b);
		
		temp = a;//temp = 20
		a = b;   //a = 20
		b = temp;//b = 10
		
		System.out.println("After swapping");
		System.out.println("a is :"+a+" b is :"+b);
	}

}
