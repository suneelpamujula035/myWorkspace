package arrays_interview_questions;

public class Segregate_0sAnd1s_InAnArray_4 {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1 };
		int j=0;
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]==0)
			{
				arr[j++] = arr[i];
			}
		}
		while(j<arr.length)
		{
			arr[j++] = 1;
		}
		for(int k=0; k<=arr.length-1; k++)
		{
			System.out.print(arr[k]+" ");
		}
		
		
	}

}
