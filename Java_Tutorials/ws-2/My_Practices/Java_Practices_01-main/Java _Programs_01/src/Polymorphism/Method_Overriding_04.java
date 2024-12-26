package Polymorphism;
class ABC
{
	void mymethod()
	{
		System.out.println("Overridden method");

	}
}
class Demo extends ABC
{
	void mymethod()
	{
		super.mymethod();
		System.out.println("Overriding method");

	}

}

public class Method_Overriding_04 {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.mymethod();

	}

}
