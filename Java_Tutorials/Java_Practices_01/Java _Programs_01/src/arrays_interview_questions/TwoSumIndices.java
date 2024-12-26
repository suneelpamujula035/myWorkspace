package arrays_interview_questions;

import java.util.HashMap;

public class TwoSumIndices {
    public static int[] findTwoSumIndices(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++)
        {
        	int difference = target - arr[i];
        	if(map.containsKey(difference))
        	{
        		return new int[]{map.get(difference), i};
        	}
        	map.put(arr[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {4,18,14,24};
        int target = 28;
        int[] result = findTwoSumIndices(arr, target);
        
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No such pair found.");
        }
    }
}
