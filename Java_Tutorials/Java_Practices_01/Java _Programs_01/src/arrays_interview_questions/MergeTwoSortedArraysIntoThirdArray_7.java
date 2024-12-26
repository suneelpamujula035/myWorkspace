package arrays_interview_questions;

public class MergeTwoSortedArraysIntoThirdArray_7 {

	public static int[] merge(int arr1[], int arr2[])
	{
		int length1 = arr1.length;
		int length2 = arr2.length;
		int[] result = new int[length1+length2];
		int i=0;
		int j=0;
		int k=0;
		while(i < length1 && j < length2)
		{
			if(arr1[i] < arr2[j])
			{
				result[k++] = arr1[i++];
			}
			else
			{
				result[k++] = arr2[j++];
			}
		}
		while(i < length1)
		{
			result[k++] = arr1[i++];
		}
		while(i < length2)
		{
			result[k++] = arr2[j++];
		}
		return result;
	}
	public static void main(String[] args) {

		int arr1[] = {1, 5, 6, 7};
		int arr2[] = {2, 5, 8, 9, 11};
		int[] result = merge(arr1, arr2);
		for(int i=0; i<result.length; i++)
		{
			System.out.println(result[i] + " ");
		}
	}

}
