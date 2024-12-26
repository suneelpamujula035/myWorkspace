package java_programs_04;

import java.util.Arrays;

public class AnagramProgramUsingStrings_14 {

	public static void main(String[] args) {

		//An anagram is a word or phrace formed by rearranging the letters of a different word or phrase
		//Example : 1."SILENT" "LISTEN" 2. "BRAINY" "BINARY" 3."ARADHYA" "HRADAYA"
		String x = "HE Is aRAdHYA";
		String y = "is he HRADAYA";
		x = x.replaceAll(" ", "");
		y = y.replaceAll(" ", "");
		x = x.toUpperCase();
		y = y.toUpperCase();
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		if(result == true)
		{
			System.out.println("Strings is anagram");
		}
		else
		{
			System.out.println("Strings is not anagram");
		}
		
	}
}
