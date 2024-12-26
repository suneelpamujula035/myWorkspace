package java_programs_04;

import java.util.Scanner;

public class BubbleSort {

	int i, j, temp;
	public void bubbbsort(int a[], int n)
	{
		
		for(i=0; i<=n-2; i++)
		{
			for(j=0; j<=n-2-i; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					//a[j] = a[j] ^ a[j+1] ^ (a[j+1] = a[j]);// a = a ^ b ^ (b = a)
				}
			}
		}
	}
	
	public void display(int a[], int n)
	{
		for(i=0; i<=n-1; i++)
		{
			System.out.print(a[i]+ "  ");
		}
	}
	public static void main(String[] args) {

		BubbleSort b = new BubbleSort();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of values to sort");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" integers");
		for(int i=0; i<=n-1; i++)
		{
			a[i] = sc.nextInt();
		}
		
//		int a[] = {89,45,68,90,29,17};
//		int n = 6;
		
		b.bubbbsort(a, n);
		b.display(a, n);
		sc.close();
	}

}
