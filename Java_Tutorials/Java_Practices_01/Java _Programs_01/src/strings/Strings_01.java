package strings;

public class Strings_01 {

	public String concat()
	{
		"to".concat("get").concat("her");
		return "together";
	}
	public static void main(String[] args) {

		String text1 = "    Hiiii friends how are you";
		String text2 = "     What are you doing";
		System.out.println(text1);
		System.out.println(text1.length());
		System.out.println(text1+text2);
		
		System.out.println(text2.charAt(2));
		System.out.println(text1.charAt(3));
		
		System.out.println(text1.trim()+text2.trim());
		
		String A = "JAVA IS A SIMPLE LANGUAGE";
		String a = "java is a object oriented programming language";
		System.out.println(A.toLowerCase());
		System.out.println(a.toUpperCase());
		
//		int j,k;
//		System.out.println(a.replace('j', 'k'));
		
		String t =  "    Hello everyone how are you";
		System.out.println(t.trim());
		
		String c = "ABC";
		String d = "abc";
		System.out.println(c.equals(d));
		System.out.println(c.equalsIgnoreCase(d));
		
		System.out.println(text1.concat(text2));
		
		
		Strings_01 msg = new Strings_01();
		System.out.println(msg.concat());
		
		String s1 = new String("Good evening friends");
		System.out.println(s1);
		
		
	}

}
