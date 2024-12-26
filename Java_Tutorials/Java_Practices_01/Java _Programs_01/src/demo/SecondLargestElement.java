package demo;

public class SecondLargestElement {

	public static void main(String[] args) {

		int arr[] = {4,5,2,6,2,9,7,7,7};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int count = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest = arr[i];
				count = 0;
			}else if(arr[i]<largest && arr[i]>secondLargest)
			{
				secondLargest = arr[i];
				count = 1;
			}else if(arr[i]==secondLargest)
			{
				count++;
			}
		}
		System.out.println("Second Largest element : "+secondLargest);
		System.out.println("Count :"+count);
	}

}
