package strings;

import java.util.StringTokenizer;

public class StringTockenizer_01 {

	public static void main(String[] args) {

		String str = "Java is an object oriented programming language";
		
		StringTokenizer t1 = new StringTokenizer(str);
		//StringTokenizer t2 = new StringTokenizer(str,"a");//It divides with letter "a"
		//StringTokenizer t3 = new StringTokenizer(str,"a",true);


		while(t1.hasMoreTokens())
		{
			System.out.println(t1.nextToken());
		}
		//StringTokenizer default token is space
	}

}
