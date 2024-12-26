package arrays_interview_questions;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> complementMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (complementMap.containsKey(nums[i])) {
				return new int[] { complementMap.get(nums[i]), i };
			}
			complementMap.put(complement, i);
		}
		return new int[] {};
	}
	public static void main(String[] args) {
		int[] nums = { 3, 6, 12, 13 };
		int target = 25;
		int[] result = twoSum(nums, target);
		if (result.length == 0) {
			System.out.println("No two sum solution");
		} else {
			System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
		}
	}

}
