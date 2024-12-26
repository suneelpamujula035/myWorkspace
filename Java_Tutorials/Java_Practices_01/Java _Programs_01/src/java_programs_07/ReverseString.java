package java_programs_07;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Hello World";
		char x[] = s.toCharArray();
		int size = x.length;
		char a[] = new char[size];
		int i = 0;
		while (i != size) {
			if (x[i] != ' ') {
				a[size - i - 1] = x[i];
			}
			i++;
		}
		System.out.println(s);
		System.out.println(a);
		
		StringBuffer sb = new StringBuffer("Suneel");
		System.out.println(sb.reverse());
	}

}
