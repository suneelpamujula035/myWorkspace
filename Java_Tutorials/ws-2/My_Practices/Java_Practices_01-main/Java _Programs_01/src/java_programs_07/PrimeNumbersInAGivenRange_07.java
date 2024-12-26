package java_programs_07;

import java.util.Scanner;

public class PrimeNumbersInAGivenRange_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to find prime number list");
		int givenNumber = sc.nextInt();
		
		for(int i=1; i<=givenNumber; i++)
		{
			int count = 0;
			for(int j=1; j<=i; j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.println(i+" is a prime number ");
			}
		}
		
	}

}
