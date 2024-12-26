package arrays_interview_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesFromUnsortedArray_5 {

	public static void removeDeplicatesUsingSorting(int arr[])
	{
		Arrays.sort(arr);
		int j=0;
		int length = arr.length;
		for(int i=0; i<length-1; i++)
		{
			if(arr[i] != arr[i+1])
			{
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[length - 1];
		for(int k=0; k<length; k++)
		{
		    System.out.print(arr[k]+" ");
		}
	}
	public static void removeDeplicatesUsingHashMap(int arr[])
	{
		Map<Integer, Integer> m = new HashMap<>();
		int length = arr.length;
		for(int i=0; i<length-1; i++)
		{
			if(m.containsKey(arr[i]))
			{
				m.put(arr[i], m.get(arr[i])+1);
			}
			else
			{
				m.put(arr[i], 1);
			}
		}
		m.forEach((k, v)-> System.out.print(k+ " "));
	}
	public static void removeDeplicatesUsingHashSet(int arr[])
	{
		Set<Integer> s = new HashSet<>();
		int length = arr.length;
		for(int i=0; i<length-1; i++)
		{
			s.add(arr[i]);
		}
		s.forEach(elem -> System.out.print(elem + " "));
	}
	public static void main(String[] args) {

		int arr[] = {5,2,3,7,8,8,5,4,9,6,5,7,3,5};
		
		removeDeplicatesUsingSorting(arr);
		System.out.println();
		removeDeplicatesUsingHashMap(arr);
		System.out.println();
		removeDeplicatesUsingHashSet(arr);
		System.out.println();
	}

}
