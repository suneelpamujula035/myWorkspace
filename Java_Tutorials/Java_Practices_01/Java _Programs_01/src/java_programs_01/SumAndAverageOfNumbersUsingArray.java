package java_programs_01;

import java.util.Scanner;

public class SumAndAverageOfNumbersUsingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many values do you want to add?");
		int  size = sc.nextInt();       // 5     10     15      20
		int sum = 0;
		
		int sumavg[] = new int[size];          //This array will based in user input
		System.out.println("Enter your numbers:   ");
		
		for(int i=0; i<size; i++)
		{
			sumavg[i] = sc.nextInt();
			sum = sum + sumavg[i];
		}
		double sum1 = sum;
		
		System.out.println("Sum is :  "+sum);
		System.out.println("Avg is :  "+sum1/size);
		
	
		sc.close();
	}

}
