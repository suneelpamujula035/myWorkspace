package Interfaces;

interface Animal
{
	 void moves();
}
interface Bird
{
	void fly();
}

public class Interface_01 implements Animal,Bird
{
	public void moves()
	{
		System.out.println("Animals move on land");
	}
	public void fly()
	{
		System.out.println("Birds fly in air");
	}

	public static void main(String[] args) 
	{
       Interface_01 id = new Interface_01();
       id.moves();
       id.fly();
	}

}
