package arrays_interview_questions;

import java.util.Random;

public class Storing_ABC_In_Array {

	public char randomAlphabet()
	{		
		return (char)('A'+ new Random().nextInt(26));
	}
	
	public char[] createArray() {
		char s[] = new char[26];
		for(int i=0; i<s.length; i++)
		{
			s[i] = (char) ('A'+i);
		}
		return s;
	}
	
	public static void main(String[] args) {

		Storing_ABC_In_Array s = new Storing_ABC_In_Array();
		char[] c = s.createArray();
		System.out.println(c);
		System.out.println(s.randomAlphabet());
	}

}
