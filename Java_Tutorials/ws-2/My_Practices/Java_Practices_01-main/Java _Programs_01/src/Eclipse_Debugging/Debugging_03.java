package Eclipse_Debugging;

public class Debugging_03 {
	
	public static void m1()
	{
		System.out.println("m1 method");
		m3();
	}
	public static void m2()
	{
		System.out.println("m2 method");
	}
	public static void m3()
	{
		System.out.println("m3 method");
		m2();
	}
	public static void main(String[] args) {

		m1();
		m2();
		m3();
	}
}
