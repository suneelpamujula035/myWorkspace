package java_programs_07;

import java.util.Scanner;

public class CalculatorOperation_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		System.out.println("Enter any operator(+,-,*,/)");
		char ch = sc.next().charAt(0);
		
		double result = 0;
		
		switch(ch)
		{
		case '+': result = first+second;break;
		case '-': result = first-second;break;
		case '*': result = first*second;break;
		case '/': result = first/second;break;
		default: System.out.println("Incorrect operator");
		}
		System.out.println(first+" "+ch+" "+second+" = "+result);
	}

}
