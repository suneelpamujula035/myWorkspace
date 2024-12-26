package Inheritance_Concepts;

class A1
{
	int z;
	public int add(int x, int y)
	{
	z = x+y;
	System.out.println(z);
	return y;
	}
}
class A2 extends A1
{
	public int sub(int x, int y)
	{
	z = x-y;
	
		System.out.println(z);
		return y;
	}
}

public class Inheritance_04 extends A2 {
	public int multi(int x, int y)
	{
	z = x*y;
	
		System.out.println(z);
		return y;
	}

	public static void main(String[] args) {
		
		Inheritance_04 d = new Inheritance_04();
		int result1 = d.add(50, 80);
		int result2 = d.sub(80, 25);
		int result3 = d.multi(4, 6);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);


		

	}

}
