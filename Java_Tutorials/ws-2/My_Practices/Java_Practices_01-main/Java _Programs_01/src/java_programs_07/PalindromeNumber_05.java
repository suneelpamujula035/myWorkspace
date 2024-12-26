package java_programs_07;

import java.util.Scanner;

public class PalindromeNumber_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check wheather it is Palindrome or not");
		int givenNumber = sc.nextInt();
		int givenNumber1 = givenNumber;
		
		int remainder = 0;
		int sum = 0;
		
		while(givenNumber > 0)
		{
			remainder = givenNumber%10;
			sum = sum * 10 +remainder;
			givenNumber = givenNumber / 10;
		}
		
		if(givenNumber1 == sum)
		{
			System.out.println("Entered number is a palindrome");
		}
		else
		{
			System.out.println("Entered number is not a palindrome");
		}
	}

}
