package com.company.demo;

public class Day5_Puzzle_05 {
	
	public int largestLengthOfSubArray(int arr[])
	{
		int maxiumLength = 1;
		for(int i=0; i<arr.length; i++)
		{
			int minimum = arr[i];
			int maximum = arr[i];
			for(int j=1+i; j< arr.length; j++)
			{
				maximum = Math.max(maximum, arr[j]);
				minimum = Math.min(minimum, arr[j]);
				if((maximum-minimum)==(j-i))
				{
					maxiumLength = Math.max(maxiumLength, maximum-minimum+1);
				}
			}
			
		}
		return maxiumLength;
	}

	public static void main(String[] args) {

		int arr[] = {5,1,3,5,2,3,4,1};
        Day5_Puzzle_05 p = new Day5_Puzzle_05();
        int maxlength = p.largestLengthOfSubArray(arr);
		System.out.println(maxlength);
	}
}
