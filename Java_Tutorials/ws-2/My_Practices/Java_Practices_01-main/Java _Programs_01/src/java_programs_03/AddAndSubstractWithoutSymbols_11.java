package java_programs_03;

public class AddAndSubstractWithoutSymbols_11 {

	public static void main(String[] args) {

		int input1 = 5;
		int input2 = 3;
		int sum = 0;// (a + b)
		int carry = 0;
		
		while(input2 !=0)
		{
			sum = input1 ^ input2;
			carry = input1 & input2;
			input1 = input1 ^ input2;
			input2 = carry<<1;
		}
		System.out.println(sum);
	}

}
