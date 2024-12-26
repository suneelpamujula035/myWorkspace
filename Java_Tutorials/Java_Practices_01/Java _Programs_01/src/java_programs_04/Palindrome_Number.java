package java_programs_04;

public class Palindrome_Number {

	public static String checkPalindrome(int n) {

		int r, sum = 0;
		int temp = n;
		String result;

		while (n > 0) {
			r = n % 10;//remainder
			sum = sum * 10 + r;
			n = n / 10;//coefficient
		}
		n = temp;
		if (temp == sum) {
			result = "Entered number is Palindrome";
			System.out.println(result);
		} else {
			result = "Entered number is not  Palindrome";
			System.out.println(result);
		}
		return result;
	}

	public static void main(String[] args) {

		checkPalindrome(4334);
	}

}
