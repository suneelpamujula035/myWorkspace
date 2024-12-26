package KeyWords;

public class Static_Keyword_01 {
	static int a = 10;
	static void display()
	{
		System.out.println("Static Methos");
	}
	static                                      //Fist static block printed
	{
		System.out.println("STATIC BLOCK");
	}

	public static void main(String[] args) {
		
		//System.out.println(a);
		System.out.println(Static_Keyword_01.a);
		display();

	}

}
