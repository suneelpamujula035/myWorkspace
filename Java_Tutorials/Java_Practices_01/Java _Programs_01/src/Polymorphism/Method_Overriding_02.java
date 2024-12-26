package Polymorphism;

class P22
{
	void property()
	{
		System.out.println("Cash, Gold, Land");
	}
	void marry()
	{
		System.out.println("Parent method : Appalamma/Subbalakshmi");
	}
}
class C extends P22
{
	void marry()
	{
		System.out.println("Child method : Alia Bhatt");
	}
}

public class Method_Overriding_02 {

	public static void main(String[] args) {
		
		P22 p = new P22();
	  //p.property();
		p.marry();
		
		C c = new C();
		c.marry();
		
		P22 p1 = new C();
		p1.marry();
		

	}

}
