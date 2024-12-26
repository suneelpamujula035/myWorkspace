package java_programs_07;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int arr[] = {2,34,45,67,453,65,78,90,40};
		
		int even = 0;
		int odd = 0; 
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Number of even numbers : "+even);
		System.out.println("Number of odd numbers : "+odd);

	}

}
