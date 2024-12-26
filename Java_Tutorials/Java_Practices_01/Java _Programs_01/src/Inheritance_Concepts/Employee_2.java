package Inheritance_Concepts;

class A
{
int a=10;
int b=20;
int c;
}
class B extends A
{
	{

	c=a+b;
	System.out.println(c);
	}
}

class C extends B
{
	{
	c=a-b;
	System.out.println(c);
	}
}
public class Employee_2 extends C
{
	
public static void main(String args[])
{
	
	B b1 = new B();
	C c1 = new C();
	
	System.out.println(b1.c);
	System.out.println(b1.c);
	
	System.out.println(c1.c);
	System.out.println(c1.c);
	
}
}

