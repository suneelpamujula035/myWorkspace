package java_programs_03;

public class AddAndSubstractWithoutSymbols_12 {

	public static void main(String[] args) {
		
		int input1 = 5;
		int input2 = 3;
		int difference = 0;// (a - b)
		int borrow = 0;
		
		while(input2 !=0)
		{
			difference = input1 ^ input2;
			borrow = ~input1 & input2;
			input1 = input1 ^ input2;
			input2 = borrow<<1;
		}
		System.out.println(difference);
	}
}
