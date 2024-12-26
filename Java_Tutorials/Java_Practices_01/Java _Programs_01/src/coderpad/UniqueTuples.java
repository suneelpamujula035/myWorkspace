package coderpad;

import java.util.HashSet;
import java.util.Set;

public class UniqueTuples {

	public static void main(String[] args) {

		String input = "abcdef";
		int k = 2;

		Set<String> uniqueTuples = findUniqueTuples(input, k);
		System.out.println("Unique Tuples: " + uniqueTuples);
	}

	private static Set<String> findUniqueTuples(String input, int k) {

		Set<String> result = new HashSet<>();
		if(input==null || k<=0 || k>input.length())
		{
			return result;
		}
		for(int i=0; i<=input.length()-k; i++)
		{
			result.add(input.substring(i, i+k));
		}
		return result;
	}

}
