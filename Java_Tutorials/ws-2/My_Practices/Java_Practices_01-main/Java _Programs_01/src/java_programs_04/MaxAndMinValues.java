package java_programs_04;

public class MaxAndMinValues {

	public static int maxValue(int arr[])
	{
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	public static int minValue(int arr[])
	{
		int min = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {

		int arr[] = {32,45,89,12,42,17,65,52};
		System.out.println(maxValue(arr));
		System.out.println(minValue(arr));
	}

}
