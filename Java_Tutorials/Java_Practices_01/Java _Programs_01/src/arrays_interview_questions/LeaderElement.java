package arrays_interview_questions;

public class LeaderElement {

	public static void main(String[] args) {

		int arr[] = {2,5,7,9,4,3,1};
		
		for(int i=0; i<arr.length; i++)
		{
			boolean flag = false;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					flag = true;
					break;
				}
			}
			if(flag == false)
			{
				System.out.println("Leader element is : "+ arr[i]);
			}
		}
	}

}
