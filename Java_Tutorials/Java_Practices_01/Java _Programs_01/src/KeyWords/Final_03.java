package KeyWords;

class Demo4
{
	public void m4()
	{
		System.out.println("Show m4 method");
	}
}
class Demo5 extends Demo4
{
	public void m4()
	{
		System.out.println("Show m5 method");
	}
}

public class Final_03 {

	public static void main(String[] args) {
		
		Demo5 d = new Demo5();
		d.m4();

	}

}
