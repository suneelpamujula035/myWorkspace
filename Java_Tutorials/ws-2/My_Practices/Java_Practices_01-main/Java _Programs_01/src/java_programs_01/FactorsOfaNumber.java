package java_programs_01;

import java.util.Scanner;

public class FactorsOfaNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int factors = 0;
		
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				factors++;
				int div = num/i; //Co-efficient
				System.out.println(num+" is divisible by "+i+" with "+div);
			}
		}
		
		System.out.println("Number of factors to "+num+" is "+factors);
		
		
		
		sc.close();
	}

}
