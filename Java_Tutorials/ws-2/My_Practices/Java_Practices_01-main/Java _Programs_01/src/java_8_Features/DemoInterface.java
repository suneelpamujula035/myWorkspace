package java_8_Features;

interface Phone
{
	void call();
	default void message()//We can also define the method in Interface (Java 8) by using default keyword
	{
		System.out.println("Sent");
	}
}
class AndroidPhone implements Phone
{

	@Override
	public void call()
	{
		System.out.println("Calling");
	}
	
}
public class DemoInterface {

	public static void main(String[] args)
	{
		Phone p = new AndroidPhone();
		p.call();
		p.message();
	}

}
