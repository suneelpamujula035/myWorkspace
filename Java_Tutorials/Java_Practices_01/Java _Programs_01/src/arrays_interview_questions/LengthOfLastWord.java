package arrays_interview_questions;

public class LengthOfLastWord {

	public static void main(String[] args) {

		String s = "Welcome to Nellore";
		int length = 0;
		String arr[] = s.split(" ");
		System.out.println(arr[arr.length-1].length());
		
		for(int i=s.length()-1; i>=0;i--)
		{
			if(s.charAt(i)==' ')
			{
				break;
			}
			else {
				length++;
			}
		}
		System.out.println("Length of the last word : "+length);
	}

}
