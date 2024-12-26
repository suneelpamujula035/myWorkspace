package arrays_interview_questions;

import java.util.HashSet;

import Collections_LinkedList.Set;

public class Finding_Duplicate_Elements_1 {

	public static void main(String[] args) {

		int a[] = {5,4,6,9,6,5,4,3,1,7};
		
		HashSet<Integer> uniqueKey = new HashSet<Integer>();
		boolean isDuplicateExists = false;
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(uniqueKey.contains(a[i]))
			{
				isDuplicateExists = true;
				System.out.println("Duplicate element  "+a[i]);
			}
			else
			{
				uniqueKey.add(a[i]);
			}
		}
		if(!isDuplicateExists)
		{
			System.out.println(-1);
		}
	}

}
