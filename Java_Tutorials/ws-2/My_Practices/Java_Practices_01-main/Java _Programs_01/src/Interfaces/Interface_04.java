package Interfaces;

interface D1
{
	void m1();
}
interface D2
{
	void m2();
}
interface D3
{
	void m3();
}

public class Interface_04 implements D1,D2,D3
{
	public void m1()
	{
		System.out.println("suneel");
	}
	public void m2()
	{
		System.out.println("pawan");
	}
	public void m3()
	{
		System.out.println("tiru");
	}

	public static void main(String[] args) {
		
		Interface_04 d1 = new Interface_04();
		d1.m1();
		d1.m2();
		d1.m3();
		

	}

}
