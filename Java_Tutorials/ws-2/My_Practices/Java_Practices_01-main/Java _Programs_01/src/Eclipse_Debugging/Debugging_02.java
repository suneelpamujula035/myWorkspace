
package Eclipse_Debugging;

public class Debugging_02 {

	public static void main(String[] args) {

		System.out.println("Start");
		int a = 10;
		System.out.println(a);
		a = a++ + ++a - ++a + a++;
		show();
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
	
	public static void show()
	{
		System.out.println("From show method");
		int k = 8;
		System.out.println(k);
		k = k-- + ++k + k++;
		System.out.println("Data is :"+k);
		System.out.println("About to exist");
	}

}
