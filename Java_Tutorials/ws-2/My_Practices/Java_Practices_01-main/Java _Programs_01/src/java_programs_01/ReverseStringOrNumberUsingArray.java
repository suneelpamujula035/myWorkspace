package java_programs_01;

import java.util.Scanner;

public class ReverseStringOrNumberUsingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string :   ");
		String sentence = sc.nextLine();
		
		char letters[] = sentence.toCharArray();
		for(int i=letters.length-1; i>=0; i--)
		{
			System.out.println(letters[i]);
		}
		
		
		sc.close();
	}

}
