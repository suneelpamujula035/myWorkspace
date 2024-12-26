package java_programs_01;

public class RemoveWhiteSpaces {

	public static String removeWhiteSpaces(String input)
	{
		StringBuilder output = new StringBuilder();
		char[] charArray = input.toCharArray();
		for(char c : charArray)
		{
			if(!Character.isWhitespace(c))
			{
				output.append(c);
			}
		}
		return output.toString();
	}
	public static void main(String[] args) {

		System.out.println(removeWhiteSpaces("Hiii friends how are you"));
	}

}
