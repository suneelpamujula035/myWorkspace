package Polymorphism;
class Parent
{
	void display()
	{
		System.out.println("PARENT METHOD");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("CHILD METHOD");
		super.display();

	}
}

public class Method_Overriding_01 {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.display();
		
//		Parent p = new Parent();
//		p.display();

	}

}
