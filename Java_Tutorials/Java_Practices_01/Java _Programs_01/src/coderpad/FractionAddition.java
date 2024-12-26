package coderpad;

public class FractionAddition {

	public static void main(String[] args) {

		int[] fraction1 = {1, 2}; // Fraction 1: 1/2
        int[] fraction2 = {1, 3}; // Fraction 2: 1/3

        int[] result = addFractions(fraction1, fraction2);
        System.out.println("Sum of fractions: " + result[0] + "/" + result[1]);
	}

	private static int[] addFractions(int[] fraction1, int[] fraction2) {

		int numerator1=fraction1[0];
		int denominator1=fraction1[1];
		int numerator2=fraction2[0];
		int denominator2=fraction2[1];
		
		int commonDenominator = denominator1*denominator2;
		
		int newNumerator1 = numerator1*denominator2;
		int newNumerator2 = numerator2*denominator1;
		
		int commonNumerator = newNumerator1+newNumerator2;
		
		int gcd = greatestCommonDivisor(commonNumerator, commonDenominator);
		
		commonNumerator = commonNumerator/gcd;
		commonDenominator = commonDenominator/gcd;
		return new int[] {commonNumerator, commonDenominator};
	}

	private static int greatestCommonDivisor(int a, int b) {
		while(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}

}
