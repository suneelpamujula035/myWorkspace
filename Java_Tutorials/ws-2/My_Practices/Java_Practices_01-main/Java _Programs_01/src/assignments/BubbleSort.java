package assignments;

import java.util.Scanner;

public class BubbleSort {

	public void bubSort(int arr[],int n)
	{
		for(int i=0; i<=n-2; i++)
		{
			for(int j=0; j<=n-2-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
					arr[j]=arr[j]+arr[j+1]-(arr[j+1]=arr[j]);
				}
			}
		}
	}
	public void display(int arr[],int n)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {76,35,89,12,54,83,95,25,19,62};
		int n = 9;
		BubbleSort b = new BubbleSort();
		b.bubSort(arr, n);
		b.display(arr, n);
	}
}
