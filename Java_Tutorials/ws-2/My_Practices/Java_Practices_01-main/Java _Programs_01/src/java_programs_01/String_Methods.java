package java_programs_01;

public class String_Methods {

	public static void main(String[] args) {
		
		//length---->returns length of the string
		
		String s="Welcome";
		System.out.println(s.length());
		
		//concatenation---->join the strings
		
		String s1= "Welcome to";
		String s2="Training";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println("Welcome to " + "Training");
		System.out.println("Welcome to".concat("Training"));
				
				//equals---->compare the string
		        //equalsIgnoreCase---->compare the string (ignore case sensitivity)
				
		String s3="WELCOME";
		String s4="welcome";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//contains---->check a string contains another string
		
		System.out.println(s3.contains("ABC"));
		
		//substring---->extracting substring from main string
		
		System.out.println(s.substring(0,3));//WEL
		System.out.println(s.substring(2,5));//LCO
		System.out.println(s.substring(4,7));//OME
		
		///replace---->replacing characters/strings within astring
		
		System.out.println(s.replace('e','a'));
		//System.out.println(s.replace('come','kame'));
		
		
	}

}
