package KeyWords;

class A
{
	int a = 20;
	void display()
	{
		System.out.println("Parent");
	}
}
class B extends A
{
	int a = 144;
	void display()
	{
		System.out.println("Child");  //Child
		System.out.println(a);        //144
		System.out.println(super.a);  //20
		super.display();              //Parent
	}
}

public class Super_Keyword {

	public static void main(String[] args) {
		B b = new B();
		b.display();

	}

}
