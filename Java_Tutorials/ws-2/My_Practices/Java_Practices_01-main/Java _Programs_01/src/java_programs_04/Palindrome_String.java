package java_programs_04;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = sc.next();
		String originalString = str;
		String rev = "";
		int length = str.length();
		int i=0;
		for(i = length-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		
		if(originalString.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
