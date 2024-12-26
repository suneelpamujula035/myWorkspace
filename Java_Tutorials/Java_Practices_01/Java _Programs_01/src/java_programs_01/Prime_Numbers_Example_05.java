package java_programs_01;

import java.util.Scanner;

public class Prime_Numbers_Example_05 {

	public static void main(String[] args) {
		
		int num,count=2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = sc.nextInt();
		sc.close();
		
		for(int i=1;i<=num;i++);
		{
			//if(num%i==0)
				count++;
		}
		if(count==2)
		{
			System.out.println("Entered number is Prime Number");
		}
		else
		{
			System.out.println("Entered number is not a Prime Number");
		}
		
	}

}
