package Arrays;

public class ArrayDemo_02 {

	public static void main(String[] args) {

		int arr[] = {8,45,89,25,15,63,78};
		
		for(int x:arr)
		{
			System.out.println(x);
		}
	
		int min=arr[0];
		int i;
		for(i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Min element : "+min);
	}

}
