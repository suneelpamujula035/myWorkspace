package sorting;

import java.util.Scanner;

public class Swapping_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int a = sc.nextInt();
		System.out.println("Enter num2");
		int b = sc.nextInt();
		
		System.out.println("Before swapping");
		System.out.println("a is :"+a+" b is :"+b);
		
		a = a+b;//10+20=30
		b = a-b;//30-20=10
		a = a-b;//30-10=20
		
		System.out.println("After swapping");
		System.out.println("a is :"+a+" b is :"+b);
	}

}
