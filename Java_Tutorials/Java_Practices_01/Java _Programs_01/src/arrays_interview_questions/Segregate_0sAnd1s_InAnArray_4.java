package arrays_interview_questions;

import java.util.Arrays;

public class Segregate_0sAnd1s_InAnArray_4 {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1 };
		int nonZeroIndex = 0;

//		List<Integer> l = new ArrayList<>();
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i]==0)
//			{
//				l.add(arr[i]);
//			}
//		}
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i]==1)
//			{
//				l.add(arr[i]);
//			}
//		}
//		System.out.println(l);
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr[nonZeroIndex] = arr[i];
				nonZeroIndex++;
			}
		}
		while(nonZeroIndex<arr.length) {
			arr[nonZeroIndex] = 0;
			nonZeroIndex++;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
