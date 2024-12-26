package java_programs_04;

public class LengthOfString_02 {

	public static void main(String[] args) {

		String x = "Welcome Students";
		x = x.concat("/0");
		System.out.println(x);
		char c[] = x.toCharArray();
		int i =0;
		int count = 0;
		while(c[i]!=0)
		{
			count++;
			i++;
		}
		System.out.println(count);
	}

}
