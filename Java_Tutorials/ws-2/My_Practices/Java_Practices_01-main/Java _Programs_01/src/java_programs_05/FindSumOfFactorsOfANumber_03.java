package java_programs_05;

public class FindSumOfFactorsOfANumber_03 {

	int sumOfFactors(int num)
	{
		int f_sum = 0;
		for (int n=1; n<=num; n++)
		{
			if(num % n==0)
			{
				f_sum+=n;
			}
		}
		return f_sum;
	}
	public static void main(String[] args) {

		FindSumOfFactorsOfANumber_03 f = new FindSumOfFactorsOfANumber_03();
		System.out.println(f.sumOfFactors(284));
	}

}
