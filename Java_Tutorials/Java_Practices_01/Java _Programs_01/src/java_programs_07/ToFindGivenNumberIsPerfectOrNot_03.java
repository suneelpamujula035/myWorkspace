package java_programs_07;

import java.util.Scanner;

public class ToFindGivenNumberIsPerfectOrNot_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find wheather number is perfect or not");
		int givenNumber = sc.nextInt();//6,28,496,8128
		int sum = 0;
		
		for(int i=1; i<givenNumber; i++) // 6              28
		{                                // 1+2+3=6        1+2+4+7+14=28
			if(givenNumber%i == 0)
			{
				sum = sum + i;
			}
		}
		if(givenNumber == sum)
		{
			System.out.println(givenNumber+" is a perfect number");
		}
		else
		{
			System.out.println(givenNumber+" is not a perfect number");
		}
		sc.close();
	}

}
