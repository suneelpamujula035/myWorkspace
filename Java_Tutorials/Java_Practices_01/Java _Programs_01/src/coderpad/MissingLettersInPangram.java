package coderpad;

import java.util.HashSet;
import java.util.Set;

public class MissingLettersInPangram {

	public static void main(String[] args) {

		String sentence = "Hello world";
        Set missingLetters = findMissingLetters(sentence);
        System.out.println("Missing Letters: " + missingLetters);
	}

	private static Set findMissingLetters(String sentence) {
		
		Set<Character> alphabetSet = new HashSet<>();
		for(char c='a'; c<='z'; c++)
		{
			alphabetSet.add(c);
		}
//		char[] charArray = sentence.replaceAll(" ", "").toCharArray();
//		for(char c :charArray)
//		{
//			System.out.println(c);
//		}
		for(char c : sentence.toCharArray())
		{
			alphabetSet.remove(c);
		}
		return alphabetSet;
	}

}
