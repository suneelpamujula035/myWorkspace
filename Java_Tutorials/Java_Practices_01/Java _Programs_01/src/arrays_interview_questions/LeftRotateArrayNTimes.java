package arrays_interview_questions;

import java.util.Arrays;

public class LeftRotateArrayNTimes {

	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50,60};
		int n = 3;
		
		for(int i=0; i<n; i++)
		{
			int first = arr[0];
			int j;
			for(j=0; j<arr.length-1; j++)
			{
				arr[j] = arr[j+1];
			}
			arr[j] = first;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
