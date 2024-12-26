package Abstraction;

abstract class A2
{
	abstract void display();
}
class B2 extends A2
{
	void display()
	{
		System.out.println("Abstract method in A");
	}
	void show()
	{
		System.out.println("SHOW METHOD");
	}
}

public class Abstract_Method_03 {

	public static void main(String[] args) {
		
		B2 b = new B2();
		b.display();
		b.show();
		

	}

}
