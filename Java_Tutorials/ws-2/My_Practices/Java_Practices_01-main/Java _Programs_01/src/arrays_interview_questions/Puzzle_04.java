package arrays_interview_questions;

public class Puzzle_04 {
	
	public String solution(String input)//AAAABBBCCDAA
	{
		char[] y = input.toCharArray();
		int size = y.length;
		int count = 1;
		String result = "";
		for(int i=1; i<size; i++)
		{
			if(y[i]!=y[i-1])
			{
				result = result + Integer.toString(count)+y[i-1];
				count = 0;
			}
			count++;
		}
		if(count>0)
		{
			result = result + Integer.toString(count)+y[size-1];
		}
		return result;
	}
		
	public static void main(String[] args) {

		Puzzle_04 p = new Puzzle_04();
		String solution = p.solution("FHDYYDBBCCCIIO");
		System.out.println(solution);
	}
}
