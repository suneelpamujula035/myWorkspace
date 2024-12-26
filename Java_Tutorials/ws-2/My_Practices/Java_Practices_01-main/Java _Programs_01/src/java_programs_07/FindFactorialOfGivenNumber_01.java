package java_programs_07;

import java.util.Scanner;

// 4! = 4*3*2*1 = 24
// 5! = 5*4*3*2*1 = 120
// ---------------------------------------------------
// 4! = 1*2*3*4 = 24
// 5! = *2*3*4*5 = 120
public class FindFactorialOfGivenNumber_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number to get factorial");
		int num1 = sc.nextInt();
		int factorial1 = 1;
		
		for(int i=1; i<=num1; i++)
		{
			factorial1 = factorial1 * i;
		}
		System.out.println(num1+" factorial is ----->"+factorial1);
		System.out.println("----------------------------------------------------");
		
		System.out.println("Enter your number to get factorial");
		int num2 = sc.nextInt();
		int factorial2 = 1;
		for(int i=num2; i>=1; i--)
		{
			factorial2 = factorial2 * i;
		}
		System.out.println(num2+" factorial is ----->"+factorial2);

	}

}
