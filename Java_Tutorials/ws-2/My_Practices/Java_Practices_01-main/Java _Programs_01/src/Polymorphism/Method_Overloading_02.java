package Polymorphism;
class A
{
	void display()
	{
		System.out.println("Display");
	}
	void display(int a)
	{
		System.out.println("a= "+a);
	}
}

public class Method_Overloading_02 {

	public static void main(String[] args) {
		A obj = new A();
		obj.display();
		obj.display(30);

	}

}
