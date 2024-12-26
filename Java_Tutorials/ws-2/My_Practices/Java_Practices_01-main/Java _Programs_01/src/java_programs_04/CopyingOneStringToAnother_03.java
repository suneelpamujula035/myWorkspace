package java_programs_04;

public class CopyingOneStringToAnother_03 {

	public static void main(String[] args) {

		String x = "Suneel Kumar";
		char[] y = x.toCharArray();
		int size = y.length;
		char[] a = new char[size];
		int i = 0;
		while(i!=size)
		{
			a[i] = y[i];
			i++;
		}
		System.out.println(y);
		System.out.println(a);
	}

}
