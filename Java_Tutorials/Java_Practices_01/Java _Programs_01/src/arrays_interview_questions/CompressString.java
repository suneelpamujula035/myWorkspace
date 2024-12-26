package arrays_interview_questions;

public class CompressString {

	public String compressString(String str)
	{
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i=0; i<str.length(); i++)
		{
			if(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
			{
				count++;
			}else {
				sb.append(str.charAt(i)).append(count);
				count=1;
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {

		CompressString c = new CompressString();
		System.out.println(c.compressString("aabbbccdddd"));
	}

}
