package Eclipse_Debugging;

public class Debugging_01 {

	public static void main(String[] args) {
		System.out.println("Start");
		int a = 10;
		a = a++ + ++a - ++a + a++;
		if(a>55)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		System.out.println("Done");
	}

}
