package java_programs_04;

public class MinValue {

	public static int minValue(int arr[])
	{
		int min = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			min = Math.min(min, arr[i]);
		}
		return min;
	}
	public static void main(String[] args) {

		int[] arr = { 4, 2, 5, 3, 6 };
		System.out.println(minValue(arr));

	}

}
