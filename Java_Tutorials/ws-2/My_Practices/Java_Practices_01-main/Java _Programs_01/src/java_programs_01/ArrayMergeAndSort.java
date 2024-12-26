package java_programs_01;

import java.util.Arrays;

public class ArrayMergeAndSort {

	public static void main(String[] args) {

		int arr1[] = {1,9,5,7,3};
		int arr2[] = {4,2,8,6,10};
		
		
		int size1 = arr1.length;
		int size2 = arr1.length;
		
		//Before sorting array
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//After sorting array
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		
		int arr3[] = new int[size1+size2];
		
		System.arraycopy(arr1, 0, arr3, 0, size1);
		System.arraycopy(arr2, 0, arr3, size1, size2);
		System.out.println("------------Merging and Sorting array-------------");
		
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
	}

}
