package Abstraction;

abstract class A3         // Abstract class---->It contain atleast one abstract method. Object can not be created.
{
	abstract void display();  // Abstract method
}
abstract class B3 extends A3   // Abstract class---->Abstract class contains abstract methods and normal methods
{
	void display()              // Normal method
	{
		System.out.println("Abstract Method in A");
	}
	abstract void show();       // Abstract method
}
class C3 extends B3            // Concrete class---->It contain only normal methods. Object can be created.
{
	void show()                   // Normal method
	{
		System.out.println("Show method in C");
	}
}

public class Abstract_Method_04 extends C3 {         // Multi-Level Inheritance concept

	public static void main(String[] args) {
		
		Abstract_Method_04 c = new Abstract_Method_04();
		c.display();
		c.show();

	}

}
