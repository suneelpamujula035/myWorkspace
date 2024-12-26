package coderpad;

import java.util.NoSuchElementException;

public class SecondSmallestSnippet {

	public static void main(String[] args) {

		int[] array = {3, 3, 1, 4, 1, 5, 9};
        try {
            int secondSmallest = findSecondSmallest(array);
            System.out.println("Second Smallest Element: " + secondSmallest);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
	}

	private static int findSecondSmallest(int[] array) {
		int count = 0; 
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i=0; i<array.length; i++)
		{
			if(array[i]<smallest)
			{
				secondSmallest = smallest;
				smallest = array[i];
				count = 0;
			}else if(array[i]>smallest && array[i]<secondSmallest)
			{
				secondSmallest = array[i];
				count = 1; 
			}else if(array[i]==secondSmallest)
			{
				count++;
			}
		}
		System.out.println("Count :"+count);
		return secondSmallest;
	}

}
