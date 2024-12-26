package Polymorphism;
public class Method_Overloading_04 
{
	void m1()                  // Same method name with different argument types is called "Method Overloading".
	{
		System.out.println("no-arg method");
	}
	void m1(int i)
	{
		System.out.println("int-arg method");
	}
	void m1(double d)
	{
		System.out.println("double-arg-method");
	}

	public static void main(String[] args) {
		
		Method_Overloading_04 t = new Method_Overloading_04();
		
		t.m1();
		t.m1(45);
		t.m1(27.4);
		
		

	}

}
