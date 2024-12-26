package arrays_interview_questions;

import java.util.Arrays;

public class SliceArray_01 {

	public int[] getSliceArray(int arr[], int startIndex, int endEndex)
	{
		int slicedArray[] = new int[endEndex-startIndex];
		for(int i=0; i<slicedArray.length; i++)
		{
			slicedArray[i] = arr[startIndex+i];
		}
		return slicedArray;
	}
	public static void main(String[] args) {

		int arr[] = {26,67,93,15,17,48,94,56,49,28,16,37};
		SliceArray_01 s = new SliceArray_01();
		int[] slicedArray = s.getSliceArray(arr, 3, 8+1);
		System.out.println("Sliced array : "+Arrays.toString(slicedArray));
	}

}
