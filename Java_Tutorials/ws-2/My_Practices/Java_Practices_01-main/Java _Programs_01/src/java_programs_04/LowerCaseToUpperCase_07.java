package java_programs_04;

public class LowerCaseToUpperCase_07 {

	public static void main(String[] args) {

		String x = "suneel kumar";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		while(i!=size)                //a-32=A(ASCII CODES)
		{                             //b-32=B
			y[i] = (char) (y[i]-32);
			i++;
		}
		System.out.println(x);
		System.out.println(y);
	}

}
