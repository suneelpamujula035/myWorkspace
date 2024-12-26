package Oops_Concepts;
class Test
{
	public void display()
	{
		System.out.println("Hello 1");
	}
	public void show1()
	{
		System.out.println("Hello 2");
	}
}

public class Final_With_Methods extends Test {
	
	public void display()
	{
		System.out.println("Ok 1");
	}

	public static void main(String[] args) {
		
		Final_With_Methods fm = new Final_With_Methods();
		fm.display();
		fm.show1();

	}

}
