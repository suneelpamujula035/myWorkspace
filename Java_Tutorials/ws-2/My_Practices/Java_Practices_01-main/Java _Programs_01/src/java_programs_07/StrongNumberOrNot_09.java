package java_programs_07;

import java.util.Scanner;

// Sum of individual factorial of  a given will gives same number is called strong number
public class StrongNumberOrNot_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some value to find whether value is strong or not");
		int givenNumber = sc.nextInt();// 145, 40585
		int givenNumber1 = givenNumber;
		
		int remainder;
		int sum;
		int total = 0;
		
		while(givenNumber > 0)
		{
			remainder = givenNumber % 10;
			sum = 1;
			for(int i=1; i<=remainder; i++)
			{
				sum = sum * i;
			}
			total = total + sum;
			givenNumber = givenNumber / 10;
		}
		if(givenNumber1 == total)
		{
			System.out.println(givenNumber1+" is a strong number");
		}
		else
		{
			System.out.println(givenNumber1+" is not a strong number");
		}
	}

}
