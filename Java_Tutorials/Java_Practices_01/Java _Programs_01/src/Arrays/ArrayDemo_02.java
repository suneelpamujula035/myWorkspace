package Arrays;

public class ArrayDemo_02 {

	public static void main(String[] args) {

		int arr[] = {8,45,89,25,15,63,78};
		
		for(int x:arr)
		{
			System.out.println(x);
		}
	
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max Number : "+max);
	}

}
