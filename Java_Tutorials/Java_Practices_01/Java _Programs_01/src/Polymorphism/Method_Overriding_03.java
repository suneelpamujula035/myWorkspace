package Polymorphism;
class Animal
{
	public void move()
	{
	    System.out.println("Animals can move");
	}
}

class Dog extends Animal 
{
	public void move()
	{
	    super.move();  
	    System.out.println("Dogs can walk and run");
	}
	
}

public class Method_Overriding_03 {

	public static void main(String[] args) {
		
		Animal b = new Dog();   // Animal reference but Dog object
	    b.move(); 
//		Dog d = new Dog();
//		d.move();
//		Animal a = new Animal();
//		a.move();

	}

}
