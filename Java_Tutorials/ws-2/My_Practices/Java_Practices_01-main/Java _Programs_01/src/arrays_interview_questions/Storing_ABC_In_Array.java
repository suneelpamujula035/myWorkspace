package arrays_interview_questions;

public class Storing_ABC_In_Array {

	public char[] createArray() {
		char s[];
		s = new char[26];
		for(int i=0; i<26; i++)
		{
			s[i] = (char) ('A'+i);
		}
		return s;
	}
	public static void main(String[] args) {

		Storing_ABC_In_Array s = new Storing_ABC_In_Array();
		char[] c = s.createArray();
		System.out.println(c);
	}

}
