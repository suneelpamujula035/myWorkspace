package java_programs_04;

public class LowerCaseToUpperCase_08 {

	public static void main(String[] args) {

		String x = "pamujula suneel kumar";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		while(i!=size)
		{
			if(y[i]!= ' ')
			{
				y[i] = (char) (y[i]-32);
			}
			i++;
		}
		System.out.println(x);
		System.out.println(y);
	}

}
