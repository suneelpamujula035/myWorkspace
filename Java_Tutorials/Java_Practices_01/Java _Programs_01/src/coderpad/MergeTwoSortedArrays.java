package coderpad;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = mergeArraysWithStreams(arr1, arr2);
        System.out.println("Merged Array with Streams: " + Arrays.toString(mergedArray));
	}

	private static int[] mergeArraysWithStreams(int[] arr1, int[] arr2) {
		return IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
	}

}
