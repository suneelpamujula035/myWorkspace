package Abstraction;

abstract class A
{
	public abstract void dog();
	public abstract void cow();
}
class B extends A
{
	public void dog()
	{
		System.out.println("Dog Barks!");
	  //System.out.println("Dog eat Chicken!");

	}
	public void cow()
	{
		System.out.println("Cow eat Grass!");
	}
}

public class Abstract_Method_01 {               // Single Inheritance concept
	
	public static void main(String[] args) {
		
		A a = new B();
		a.dog();
		a.cow();
		
		

	}

}
