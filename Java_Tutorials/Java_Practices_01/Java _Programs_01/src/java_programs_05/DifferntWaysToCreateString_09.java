package java_programs_05;

public class DifferntWaysToCreateString_09 {

	public static void main(String[] args) {

		//We can create String using 4 ways
		// 1.String
		// 2.String Buffer
		// 3.String Builder
		// 4. Arrays
		
		//1.String
		//String s1 = new String("Hello world");
		//String s2 = "Hello world";
		String s1 = "Hello world";
		String s2 = "Hello world";
		
		if(s1 == s2)
		{
			System.out.println("both of the objects pointing to the same reference");
		}
		else
		{
			System.out.println("both of the objects pointing to the different reference");
		}
		
		String s3 = 10+" java";//number + string = string
		System.out.println(s3);
		String s4 = 15.7+" java";//number + double = string
		System.out.println(s4);
	}

}
