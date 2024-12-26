package Abstraction;

abstract class Vehicle
{
	abstract void start();
}
class Car extends Vehicle
{
	void start()
	{
		System.out.println("Car starts with key");
	}
}
class Scooter extends Vehicle 
{
	void start()
	{
		System.out.println("Scooter starts with kick");
	}
}

public class Abstract_Method_05 {            // Heirarchical Inheritance concept

	public static void main(String[] args) {
		
		Car c = new Car();
		c.start();
		Scooter s = new Scooter();
		s.start();

	}

}
