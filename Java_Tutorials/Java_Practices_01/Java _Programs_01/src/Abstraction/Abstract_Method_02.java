package Abstraction;

abstract class A1
{
	public abstract void display();
	public void show()
	{
		System.out.println("SHOW METHOD");
	}
}
class B1 extends A1
{
	public void display()
	{
		System.out.println("Abstract method in A");
	}
}

public class Abstract_Method_02 {

	public static void main(String[] args) {
		B1 b = new B1();
		b.display();
		b.show();

	}

}
