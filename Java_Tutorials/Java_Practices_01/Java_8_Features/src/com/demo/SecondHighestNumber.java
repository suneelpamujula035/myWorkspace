package com.demo;

import java.util.Collections;
import java.util.stream.Stream;

public class SecondHighestNumber {

	public int secondHighestNumber(int arr[]) {
		int largest = 0;
		int secondLargest = 0;
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondLargest&&arr[i]<largest)
			{
				secondLargest=arr[i];
			}
		}
		// return
		// Arrays.stream(arr).distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		return secondLargest;
	}

	public int maxNumber(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public Integer secondLargest(Integer arr[]) {
		return Stream.of(arr).distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	}

	public static void main(String[] args) {

		int arr[] = { 23, 76, 98, 85 };
		Integer nums[] = { 23, 76, 98, 85 };
		SecondHighestNumber s = new SecondHighestNumber();
		System.out.println("Second Highest number in Array is : " + s.secondHighestNumber(arr));
		// System.out.println("Second Highest number in Array using Java 8 feature : " +
		// s.secondLargest(nums));
		System.out.println("Highest number in Array is : " + s.maxNumber(arr));
	}

}