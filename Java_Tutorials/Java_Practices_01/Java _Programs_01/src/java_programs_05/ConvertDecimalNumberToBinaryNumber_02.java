package java_programs_05;

public class ConvertDecimalNumberToBinaryNumber_02 {

	public static void printBinaryFormat(int number)
	{
		int binary[] = new int[number];
		int index = 0;
		binary[index++] = number%2;
		number = number/2;
		
		for(int i = index-1;i>=0; i--)
		{
			System.out.println(binary[i]);
		}
	}
	public static void main(String[] args) {

		printBinaryFormat(1789);
	}

}
