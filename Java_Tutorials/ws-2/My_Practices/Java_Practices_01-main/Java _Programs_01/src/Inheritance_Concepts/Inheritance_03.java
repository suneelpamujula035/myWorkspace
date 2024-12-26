package Inheritance_Concepts;

class Demo11
{
	int c;
	public void add(int a, int b)
	{
		c=a+b;
		System.out.println(c);
	}
}
class Demo22 extends Demo11
{
	public void sub(int a, int b)
	{
		c=a-b;
		System.out.println(c);
	}
}
public class Inheritance_03 extends Demo22
{
	public void multi(int a, int b)
	{
		c=a*b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		//int x =10;
		//int y =20;

		
		Inheritance_03 d1 = new Inheritance_03();
		
		d1.add(10, 50);
		d1.sub(50, 30);
		d1.multi(2,8);
		
		

	}

}
