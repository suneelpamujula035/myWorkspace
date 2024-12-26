package java_programs_07;

import java.util.Scanner;

public class PrimeNumber_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is prime number or not");
		int givenNumber = sc.nextInt();
		//int sum = 0;
		int count=0;
		
		for(int i=1; i<=givenNumber; i++)
		{
			if(givenNumber%i == 0)
			{
				//sum = sum + 1;
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println(givenNumber+" is prime number");
		}
		else
		{
			System.out.println(givenNumber+" is not a prime number");
		}
	}

}
