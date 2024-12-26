package arrays_interview_questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonElementsInArray {

	public List<Integer> commmonElementsInArray(int arr1[], int arr2[])
	{
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					list.add(arr1[i]);
					break;
				}
			}
		}
		return list;
	}
	
	public void printIntersection(int arr1[], int arr2[])
	{
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<arr1.length; i++)
		{
			set.add(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++)
		{
			if(set.contains(arr2[i]))
			{
				System.out.println(arr2[i]);
			}
		}
	}
	public void printUnion(int arr1[], int arr2[])
	{

		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<arr1.length; i++)
		{
			set.add(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++)
		{
			set.add(arr2[i]);
		}
		System.out.println("Union");
		System.out.println(set);
	
	}
	public static void main(String[] args) {

		int arr1[] = {80, 10, 15, 2, 35, 60};
		int arr2[] = {35, 80, 60, 20, 75};
		CommonElementsInArray c = new CommonElementsInArray();
		System.out.println(c.commmonElementsInArray(arr1, arr2));
		c.printIntersection(arr1, arr2);
		c.printUnion(arr1, arr2);
	}

}
