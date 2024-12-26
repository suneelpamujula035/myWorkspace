package java_programs_04;

public class FindingMaxNum {

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
	public static void main(String[] args) {

		FindingMaxNum f = new FindingMaxNum();
		int arr[] = {34, 12, 65};
		System.out.println(maxValue(arr));
	}

}
