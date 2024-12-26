package java_programs_04;

public class PalindromeString_06 {

	public static boolean isPalindrome(String str)
	{
		str.replaceAll(" ", "");
		str.toLowerCase();
		
		int i=0; int j=str.length()-1;
		while(i>j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {

		System.out.println(isPalindrome("too Hot to HOOT"));
//		String x = "too Hot to HOOT";
//		x.replace(" ", "");
//		x.toLowerCase();
//		char[] y = x.toCharArray();
//		int size = y.length;
//		char[] a = new char[size];
//		int i = 0;
//		while(i!=size)
//		{
//			a[size-1-i] = y[i];
//			++i;
//		}
//
//		while(i!=size)
//		{
//			if(a[i] != y[i])
//			{
//				System.out.println("Not a Palindrome");
//				System.exit(0);
//			}
//			else
//			{
//				++i;
//				continue;
//			}
//		}
//		System.out.println("Palindrome");
	}

}
