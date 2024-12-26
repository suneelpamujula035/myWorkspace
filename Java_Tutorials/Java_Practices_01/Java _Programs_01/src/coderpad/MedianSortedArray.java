package coderpad;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianSortedArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 2, 4, 6 };

		double median = findMedianWithStreams(arr1, arr2);
		System.out.println("Median with Streams: " + median);
	}

	private static double findMedianWithStreams(int[] arr1, int[] arr2) {
		int[] mergedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
		int n = mergedArray.length;
		if (n % 2 == 0) {
			return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
		}else {
		return mergedArray[n / 2];
		}
	}
}
