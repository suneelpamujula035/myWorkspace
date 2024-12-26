package java_programs_01;

import java.util.Scanner;

public class CountCharactersUsingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string :  ");
		
		String sentence = sc.nextLine();
		
		char letters[] = sentence.toCharArray();
		int alphabets = 0;
		int numbers = 0;
		int spaces = 0;
		int specialCharacters = 0;
		
		for(int i=0; i<letters.length; i++)
		{
			if(Character.isAlphabetic(letters[i]))
			{
				alphabets++;
			}
			else if(Character.isDigit(letters[i]))
				{
					numbers++;
				}
			
			else if(Character.isSpaceChar(letters[i]))
			{
				spaces++;
			}
			else
			{
				specialCharacters++;
			}
		}
		
		System.out.println("Alphabets : "+alphabets);
		System.out.println("Numbers : "+numbers);
		System.out.println("Spaces : "+spaces);
		System.out.println("SpecialCharacters : "+specialCharacters);
		
		sc.close();
	}

}
