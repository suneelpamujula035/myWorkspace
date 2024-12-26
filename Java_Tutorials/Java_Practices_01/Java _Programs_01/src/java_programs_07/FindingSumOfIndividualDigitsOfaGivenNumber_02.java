package java_programs_07;

import java.util.Scanner;

public class FindingSumOfIndividualDigitsOfaGivenNumber_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some value to to find of its individual digits");
		int givenNumber = sc.nextInt();//123
		int givenNumber1 = givenNumber;
		
		int sum = 0;// 0-->3-->5-->6
		int remainder = 0;
		
		while(givenNumber > 0)             // 123 > 0      12 > 0     1 > 0
		{
			remainder = givenNumber % 10;  // 123%10=3     12%10=2    1%10=1
			sum = sum + remainder;
			givenNumber = givenNumber / 10;// 123/10=12     12/10=1   1/10=0
		}
		System.out.println("The sum of individual digits of a "+givenNumber1+" is : "+sum);
	}

}
