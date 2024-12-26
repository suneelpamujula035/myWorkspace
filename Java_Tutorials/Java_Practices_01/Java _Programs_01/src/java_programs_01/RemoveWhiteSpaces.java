package java_programs_01;

public class RemoveWhiteSpaces {

	public static String removeWhiteSpaces(String input)
	{
		StringBuilder sb = new StringBuilder();
		for(char c : input.toCharArray())
		{
			if(!Character.isWhitespace(c))
			{
				sb.append(c);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {

		System.out.println(removeWhiteSpaces("Hiii friends how are you"));
	}

}
