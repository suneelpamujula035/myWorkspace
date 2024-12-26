package java_programs_07;

import java.util.Scanner;

public class Execute {

	Scanner sc = new Scanner(System.in);
	public void findFactorial()
	{
		System.out.println("Enter a number to get factorial number");
		int givenNumber = sc.nextInt();
		int sum = 1;
		
		for(int i=1; i<=givenNumber; i++)
		{
			sum = sum*i;
		}
		System.out.println(givenNumber+" factorial is ----> "+sum);
	}
	public void  sumOfIndividualDigits()
	{
		System.out.println("Enter a number to get sum of individual numbers");
		int givenNumber = sc.nextInt();
		int givennumber1 = givenNumber;
		int remainder = 0;
		int sum = 0;
		while(givenNumber > 0)
		{
			remainder = givenNumber % 10;
			sum = sum + remainder;
			givenNumber = givenNumber / 10;
		}
		System.out.println("Sum of individual digits of "+givennumber1+" is "+sum);
	}
	public void findPerfectNumber()
	{
		System.out.println("Enter a number to find wheather a number is perfect or not");
		int givenNumber = sc.nextInt();
		int sum = 0;
		for(int i=1; i<givenNumber; i++)
		{
			if(givenNumber%i == 0)
			{
				sum = sum+i;
			}
		}
		if(givenNumber==sum)
		{
			System.out.println("Entered number is perfect number");
		}
		else
		{
			System.out.println("Entered number is not a perfect number");
		}
	}
	public void fibonacciSeries()
	{
		System.out.println("Enter a number to get range of Fibonacci series");
		int givenNumber = sc.nextInt();
		int i1 = 0;
		int i2 = 1;
		int sum = 0;
		
		for(int i=1; i<=givenNumber; i++)
		{
			sum = i1+i2;
			System.out.print(i1+" ");
			i1 = i2;
			i2 = sum;
		}
	}
	public void palindormeOrNot()
	{
		System.out.println("Enter a number to find whether a number is palindrome or not");
		int givenNumber = sc.nextInt();
		int givenNumber1 = givenNumber;
		int remainder = 0;
		int sum = 0;
		
		while(givenNumber > 0)
		{
			remainder = givenNumber % 10;
			sum = sum*10+remainder;
			givenNumber = givenNumber / 10;
		}
		if(givenNumber1 == sum)
		{
			System.out.println(givenNumber1+" is a palindrome number");
		}
		else
		{
			System.out.println(givenNumber1+" is not a palindrome number");
		}
	}
	public void primeNumberOrNot()
	{
		System.out.println("Enter a number to find wheathe a number is palindrome or not");
		int givenNumber = sc.nextInt();
	    int count = 0;
	    
	    for(int i=1; i<=givenNumber; i++)
	    {
	    	if(givenNumber%i == 0)
	    	{
	    		count++;
	    	}
	    }
	    if(count == 2)
	    {
	    	System.out.println(givenNumber+" is a Prime Number");
	    }
	    else
	    {
	    	System.out.println(givenNumber+" is not a Prime Number");
	    }
	}
	public void primeNumbersInARange()
	{
		System.out.println("Enter a number to get prime numbers range");
		int givenNumber = sc.nextInt();
		for(int i=1; i<=givenNumber; i++)
		{
			int count = 0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.println(i+" is prime number");
			}
		}
	}
		public void reverseNumber()
		{
			System.out.println("Enter a number to reverse the number");
			int givenNumber = sc.nextInt();
			int givenNumber1 = givenNumber;
			int remainder = 0;
			int sum = 0;
			
			while(givenNumber > 0)
			{
				remainder = givenNumber % 10;
				sum = sum*10+remainder;
				givenNumber = givenNumber / 10;
			}
		  System.out.println(givenNumber1+" reverse number is "+sum);
		}
		public void strongNumberOrNot()
		{
			System.out.println("Enter a number to find whether a number is strong number or not");
			int givenNumber = sc.nextInt();
			int givenNumber1 = givenNumber;
			int remainder = 0;
			int total = 0;
			
			while(givenNumber > 0)
			{
				remainder = givenNumber % 10;
				int sum = 1;
				for(int i=1; i<=remainder; i++)
				{
					sum = sum * i;
				}
				total = total+sum;
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
	
	public static void main(String[] args) {

		Execute e = new Execute();
		//e.findFactorial();
		//e.sumOfIndividualDigits();
		//e.findPerfectNumber();
		//e.fibonacciSeries();
		//e.palindormeOrNot();
		//e.primeNumberOrNot();
		//e.primeNumbersInARange();
		//e.reverseNumber();
		//e.strongNumberOrNot();
	}

}
