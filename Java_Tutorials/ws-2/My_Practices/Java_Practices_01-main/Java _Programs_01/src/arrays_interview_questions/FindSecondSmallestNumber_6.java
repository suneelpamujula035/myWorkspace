package arrays_interview_questions;

public class FindSecondSmallestNumber_6 {

	public static int getSecondSmallestNumber(int[] arr) {
		//Integer.MAX_VALUE = 2147483647;
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < smallest)
			{
				smallest = arr[i];
			}
			if(arr[i] > smallest && arr[i] < secondSmallest)
			{
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}
	public static void main(String[] args) {

		int arr[] = {4, 70, 10, 34, 6, 18, 78};
		int result = getSecondSmallestNumber(arr);
		System.out.println("Second smallest number is = "+result);
	}

}
