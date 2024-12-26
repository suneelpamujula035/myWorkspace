package sorting;

import java.util.Scanner;

public class BubbleSorting_01 {

	public static void main(String[] args) {

		int num, i, j, temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of values to sort");
		num = input.nextInt();
		
		int array[] = new int[num];
		System.out.println("Enter "+num+" integers");
		
		for(i=0; i<num; i++)
		{
			array[i] = input.nextInt();
		}
		
		for(i=0; i<num-1; i++)
		{
			for(j=0; j<num-i-1; j++)
			{
				if(array[j]>array[j+1])
				{                         //a = array[j]; b = array[j+1]
					temp = array[j];      //temp = a;
					array[j] = array[j+1];//a = b;
					array[j+1] = temp;    //b = temp;
				}
			}
		}
		
		System.out.println("Sorted List : ");
		for(i=0; i<num; i++)
		{
			System.out.print(array[i]+"  ");
			//System.out.println(array[i]);
		}
		input.close();
	}

}
