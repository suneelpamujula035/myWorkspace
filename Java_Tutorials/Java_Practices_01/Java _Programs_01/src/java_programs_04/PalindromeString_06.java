package java_programs_04;

public class PalindromeString_06 {

	public static void main(String[] args) {

		String x = "too Hot to HOOT";
		x.replace(" ", "");
		x.toLowerCase();
		char[] y = x.toCharArray();
		int size = y.length;
		char[] a = new char[size];
		int i = 0;
		while (i != size) {
			a[size - 1 - i] = y[i];
			++i;
		}

		int j = 0;
		while (j != size) {
			if (a[j] != y[j]) {
				System.out.println("Not a Palindrome");
				System.exit(0);
			}
			j++;
		}
		System.out.println("Palindrome");
	}

}
