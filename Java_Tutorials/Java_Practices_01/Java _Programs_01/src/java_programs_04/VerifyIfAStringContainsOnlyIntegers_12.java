package java_programs_04;

public class VerifyIfAStringContainsOnlyIntegers_12 {

	public static void main(String[] args) {

		String x = "67gf9983";
		int size = x.length();
		int i = 0;
		while(i!=size)
		{
			if(x.charAt(i)>='0' && x.charAt(i)<='9')
			{
				i++;
			}
			else
			{
				System.out.println("Not an Integer string");
				System.exit(i);
			}
		}
		System.out.println("Integer string");
	}

}
