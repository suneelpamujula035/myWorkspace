package java_programs_04;

public class SwapTwoStringsWithoutThirdVariable_31 {

	public static void main(String[] args) {

		String a = "SACHIN";//here length is 6
		String b = "TENDULKAR";//here length is 9
		
		System.out.println("Before Swapping a : "+a);
		System.out.println("Before Swapping b : "+b);
		
		a = a + b;// this time length of string becomes 15
		b = a.substring(0,a.length() - b.length());// here two parameters which are specified are beginning in Index and ending in Index so "SACHIN" gets copied in b
		a = a.substring(b.length());// here only beginning  Index is specified and hence it copies till the end so "TENDULKAR" gets copied a
		
		System.out.println("After Swapping a : "+a);
		System.out.println("After Swapping b : "+b);
	}

}
