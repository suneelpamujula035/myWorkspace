package arrays_interview_questions;

import java.util.Arrays;

public class FindDuplicates {

	public void findDuplicateElements(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < i; j++) {
				if (arr[j] == arr[i]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 10, 17, 7, 12, 7, 14, 12};
		FindDuplicates f = new FindDuplicates();
		f.findDuplicateElements(arr);
		System.out.println("------------------");
		Arrays.stream(arr).distinct().forEach(System.out::println);
	}

}
