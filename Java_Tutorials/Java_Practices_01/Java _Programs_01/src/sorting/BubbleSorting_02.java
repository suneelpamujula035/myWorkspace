package sorting;

import java.util.Scanner;

public class BubbleSorting_02 {

	public static void main(String[] args) {

		int num, i, j, temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of values to sort");
		num = sc.nextInt();
		int array[] = new int[num];
		System.out.println("Enter "+num+" integers");
		for(i=0; i<num; i++)
		{
			array[i] = sc.nextInt();
		}
		
		for(i=0; i<num-1; i++)
		{
			for(j=0; j<num-i-1; j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted list:");
		for(int x:array)
		{
			System.out.print(x+"  ");
		}
	}

}
