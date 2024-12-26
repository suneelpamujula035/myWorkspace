package java_programs_02;

import java.util.Scanner;


public class Add_two_numbers {

	public static void main(String[] args) {
		
		int a,b,c;
		System.out.println("Enter the a, b values");
		Scanner sc = new Scanner(System.in);
		a =sc.nextInt();
		b= sc.nextInt();
		sc.close();
		
		c= a+b;
		
		System.out.println("Value of  C:" +c);
		//System.out.println(c);

	}

	
}
