package arrays_interview_questions;

public class ReverseAlphaOnly {

	public static String reverseAlphaOnly(String str) {
        StringBuilder alphachar = new StringBuilder();
        for(char c : str.toCharArray())
        {
        	if(Character.isLetter(c))
        	{
        		alphachar.append(c);
        	}
        }
        alphachar.reverse();
        StringBuilder result = new StringBuilder();
        int alphaIndex = 0;
        for(char c : str.toCharArray())
        {
        	if(Character.isLetter(c))
        	{
        		result.append(alphachar.charAt(alphaIndex));
        		alphaIndex++;
        	}else {
        		result.append(c);
        	}
        }
        return result.toString();
    }
	public static void main(String[] args) {

        System.out.println("Output: " + reverseAlphaOnly("ab@#cd&*ef%$"));
	}

}
