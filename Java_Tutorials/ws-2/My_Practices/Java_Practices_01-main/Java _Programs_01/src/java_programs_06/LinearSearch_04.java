package java_programs_06;

import java.util.Scanner;

public class LinearSearch_04 {

	private int keyPositon=0;
	public int linearSearch(int arr[],int key)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==key)
			{
				keyPositon=i;
				break;
			}
			else {
				keyPositon=-1;
			}
		}
		return keyPositon;
	}
	public static void main(String[] args) {
		int a[] = {10,20,25,30,40,45,50,55,60,70,80,90,95};

		LinearSearch_04 l = new LinearSearch_04();
		System.out.println("Result : "+l.linearSearch(a, 55));
//		
//		while(true)
//		{
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter key");
//			int key = sc.nextInt();
//			
//			int keyPosition = 0;
//			for(int i=0; i<=a.length-1; i++)
//			{
//				if(a[i]==key)
//				{
//					keyPosition = i;
//					break;
//				}
//				else
//				{
//					keyPosition = -1;
//				}
//			}
//			System.out.println("Key pas "+ keyPosition);
//		}
	}
}
