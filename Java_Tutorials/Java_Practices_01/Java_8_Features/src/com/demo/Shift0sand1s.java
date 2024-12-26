package com.demo;

import java.util.Arrays;

public class Shift0sand1s {

	public static void main(String[] args) {

		int arr[] = {1,0,0,1,0,1,0,1,1,0,1,0};
		int nonZeroIndex = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr[nonZeroIndex]=arr[i];
				nonZeroIndex++;
			}
		}
		while(nonZeroIndex<arr.length)
		{
			arr[nonZeroIndex]=0;
			nonZeroIndex++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
