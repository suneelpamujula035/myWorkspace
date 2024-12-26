package Interfaces;

interface Demo1
{
	public void method1();
}
interface Demo2 extends Demo1
{
	public void method2();
}
interface Demo3 extends Demo2
{
	public void method3();
}

public class Interface_03 implements Demo3
{
	public void method1()
    {
 	   System.out.println("Suneel");
    }
    public void method2()
    {
 	   System.out.println("Pawan");
    }
    public void method3()
    {
 	   System.out.println("Tiru");
    }



	public static void main(String[] args)
	{
		
		Interface_03 id = new Interface_03();
		id.method1();
		id.method2();
		id.method3();

       	}

}
