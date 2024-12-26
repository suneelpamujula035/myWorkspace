package strings;

public class Strings_02 {

	public static void main(String[] args) {

		String str = "Java is an object oriented programming language";

		String s[] = str.split(" ");
		System.out.println(s.length);
		for(String x:s)
		{
			System.out.println(x);
		}
	}

}
