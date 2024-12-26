package java_programs_07;

import java.util.Scanner;

public class ReverseANumber_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to  a reverse number");
		int givenNumber = sc.nextInt();
		int givenNumber1 = givenNumber;
		int remainder = 0;
		int sum = 0;
		
		while(givenNumber > 0)
		{
			remainder = givenNumber % 10;
			sum = sum * 10 + remainder;
			givenNumber = givenNumber / 10;
		}
		System.out.println(givenNumber1+" reverse number is "+ sum);
	}

}
