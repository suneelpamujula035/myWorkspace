package java_programs_04;

public class PalindromeString_05 {

	public static void main(String[] args) {

		String x = "mom";
		char[] y = x.toCharArray();
		int size = y.length;
		char a[] = new char[size];
		int i = 0;
		while(i!=size)
		{
			a[size-i-1] = y[i];
			i++;
		}
		int j=0;
		while(j!=size)
		{
			if(a[j]!=y[j])
			{
				System.out.println("Not a palindrome");
				System.exit(j);
			}
			j++;
		}
		System.out.println("Palindrome");
	}
}
