package arrays_interview_questions;

public class FindMinAndMaxElementsInArray_8 {

	public static int minElement(int arr[])
	{
		int min = arr[0];//5
		for(int i=1; i<arr.length; i++)
		{
//			if(arr[i] < min)
//			{
//				min = arr[i];
//			}
			min = Math.min(min, arr[i]);
		}
		return min;
	}
	public static int maxElement(int arr[])
	{
		int max = arr[0];//5
		for(int i=1; i<arr.length; i++)
		{
//			if(arr[i] > max)
//			{
//				max = arr[i];
//			}
			max = Math.max(arr[i], max);
		}
		return max;
	}
	public static void main(String[] args) {

		int arr[] = {5, 6, 1, 2, 3, 4};
		int result1 = minElement(arr);
		System.out.println("Minium element in Array is : "+result1);
		int result2 = maxElement(arr);
		System.out.println("Minium element in Array is : "+result2);
	}

}
