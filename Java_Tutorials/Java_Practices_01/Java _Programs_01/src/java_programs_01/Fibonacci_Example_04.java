package java_programs_01;

import java.util.Scanner;

public class Fibonacci_Example_04 {

	public static void main(String[] args) {
		
		int n1,n2, sum;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter n1 value");
		n1=sc.nextInt();
		System.out.println("Enter n2 value");
		n2=sc.nextInt();
		System.out.println("Enter sum value");
		sum=sc.nextInt();
		sc.close();

		
        System.out.println(n1+" "+n2);  //0 1
		
		for(int i=2;i<10;i++)
		{
			sum=n1+n2;  //1+1 1+2 2+3 3+5 5+8  8+13 13+21 21+34
			System.out.println(" "+sum); //1 2 3 5 8 13 21 34 55 84
			n1=n2;  //2
			n2=sum;  //3
		}

	}

}
