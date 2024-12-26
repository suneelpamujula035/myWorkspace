package KeyWords;

class Demo
{
	static int a = 25;
	static void display()
	{
		System.out.println("static method");
	}
	static
	{
		System.out.println("Static Block");
	}
}

public class Static_Keyword_02 {

	public static void main(String[] args) {
		
		System.out.println("Hiiii Friends");
		System.out.println(Demo.a);
		Demo.display();

	}

}
