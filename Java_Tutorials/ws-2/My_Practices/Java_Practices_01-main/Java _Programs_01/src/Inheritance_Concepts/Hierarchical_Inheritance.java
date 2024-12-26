package Inheritance_Concepts;

class Demo1
{
	int c;
	public void add(int a, int b)
	{
		c=a+b;
		System.out.println(c);
	}
}
class Demo2 extends Demo1
{
	public void sub(int a, int b)
	{
		c=a-b;
		System.out.println(c);
	}
 }
class Demo3 extends Demo1
{
	public void multi(int a, int b)
	{
    c=a*b;
	System.out.println(c);
}
public static class Hierarchical_Inheritance
{
	
	public static void main(String[] args)
		{   
	
		Demo2 d2 = new Demo2();
	    Demo3 d3 = new Demo3();
	
		d2.add(10, 150);
		d2.sub(50, 20);
		//d2.multi(4, 8);
		
		d3.add(10, 150);
		//d3.sub(50, 20);
		d3.multi(4, 8);
	}

}
}