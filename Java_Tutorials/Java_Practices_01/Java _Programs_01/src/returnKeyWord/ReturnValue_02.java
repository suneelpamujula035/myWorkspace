package returnKeyWord;

public class ReturnValue_02 {

	public static void test1()
	{
		
	}
	public static int test2()
	{
		return 5;
	}
	public static double test3()
	{
		return 7.45;
	}
	public static String test4()
	{
		return "hiiii";
	}
	public static char test5()
	{
		return 'A';
	}
	public static void main(String[] args) {

		test1();
		int ex2 = test2();
		System.out.println(ex2);
		double ex3 = test3();
		System.out.println(ex3);
		String ex4 = test4();
		System.out.println(ex4);
		char ex5 = test5();
		System.out.println(ex5);
	}

}
