package java_programs_04;

public class PrintNumbersWithoutUsingLoops {

	public static void printNum(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	public static void printNumbers(int startingNum, int endingNum)
	{
		if(startingNum<=endingNum)
		{
			System.out.println(startingNum);
			startingNum++;
			printNumbers(startingNum, endingNum);
		}
	}
	public static void main(String[] args) {

		printNum(40);
		printNumbers(6, 78);
	}

}
