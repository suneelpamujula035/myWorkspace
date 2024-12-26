 package java_programs_04;

import java.util.Arrays;

public class AnagramProgramUsingStrings_13 {

	public static void main(String[] args) {

		//An anagram is a word or phrace formed by rearranging the letters of a different word or phrase
		//Example : 1."SILENT" "LISTEN" 2. "BRAINY" "BINARY" 3."ARADHYA" "HRADAYA"
		String x = "SILENT";
		String y = "LISTEN";
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		if(result == true)
		{
			System.out.println("Entered string is an anagram");
		}
		else
		{
			System.out.println("Entered string is not an anagram");
		}
		
	}
}
