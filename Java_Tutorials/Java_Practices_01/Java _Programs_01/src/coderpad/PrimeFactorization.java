package coderpad;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

	public static void main(String[] args) {

		int number = 56;
        List<Integer> primeFactors = getPrimeFactors(number);
        System.out.println("Prime Factorization of " + number + ": " + primeFactors);
	}

	private static List<Integer> getPrimeFactors(int number) {
		List<Integer> factors = new ArrayList<>();
		
		while(number%2==0)
		{
			factors.add(2);
			number = number/2;
		}
		
		for(int i=3; i<=Math.sqrt(number); i+=2)
		{
			if(number%i==0)
			{
				factors.add(i);
				number = number/i;
			}
		}
		
		if(number>2)
		{
			factors.add(number);
		}
		return factors;
	}
}
