package coderpad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimalSubset {

	public static void main(String[] args) {

		int[] array = { 4, 3, 1, 2, 7, 5 };
		int target = 10;

		List<Integer> minimalSubset = findMinimalSubset(array, target);
		System.out.println("Minimal Subset: " + minimalSubset);
	}

	private static List<Integer> findMinimalSubset(int[] array, int target) {
		Arrays.sort(array);
		reverseArray(array);

		List<Integer> subset = new ArrayList<>();
		int sum = 0;

		for (int num : array) {
			if (sum >= target)
				break;
			subset.add(num);
			sum = sum + num;
		}
		return subset;
	}

	private static void reverseArray(int[] array) {
		int left=0;
		int right=array.length-1;
		while(left<right)
		{
			int temp=array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
		

	}
}
