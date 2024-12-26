package KeyWords;

class Demo1                            //Final for not Inheritable class
{
	public void m1()
	{
		System.out.println("Show m1 method");
	}
}
class Demo2 extends Demo1
{
	public void m2()
	{
		System.out.println("Show m2 method");
	}
}

public class Final_02 {

	public static void main(String[] args) {
		
		Demo2 d = new Demo2();
		d.m2();
		d.m1();

	}

}
