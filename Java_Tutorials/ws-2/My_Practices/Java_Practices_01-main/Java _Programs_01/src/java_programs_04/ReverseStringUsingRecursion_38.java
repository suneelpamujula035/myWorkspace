package java_programs_04;

public class ReverseStringUsingRecursion_38 {

	static String recursiveString(String s)
	{
		if(s==null || s.length()<=1)
		{
			return s;
		}
		return recursiveString(s.substring(1))+s.charAt(0);
	}
	public static void main(String[] args) {

		String s = "suneel";
		System.out.println(recursiveString(s));
	}

}
