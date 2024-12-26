package Inheritance_Concepts;

class HierarchicalInheritance
{
	public void DisplayA()
	{
		System.out.println("This is content of parent class");
	}
}
class suneel extends HierarchicalInheritance
{
	public void DisplayB()
	{
		System.out.println("This is a content of child class1");
	}
}
class pawan extends HierarchicalInheritance
{
	public void DisplayC()
	{
		System.out.println("This is a content of child class2");
	}
}

public class HeirarchicalInheritanceMain {

	public static void main(String[] args) {
		System.out.println("Calling for child class C");
		suneel b = new suneel();
		b.DisplayA();
		b.DisplayB();
		
		System.out.println("Calling for child class B");
		pawan a = new pawan();
		a.DisplayA();
		a.DisplayC();

	}

}
