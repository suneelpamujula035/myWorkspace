package java_programs_04;

public class ReversingAString_04 {

	public static void main(String[] args) {

		String x = "Suneel Kumar";
		char[] y = x.toCharArray();
		int size = y.length;
		char a[] = new char[size];
		int i = 0;
		while(i!=size)
		{
			a[size-1-i] = y[i];
			i++;
		}
		System.out.println(a);
	}

}
