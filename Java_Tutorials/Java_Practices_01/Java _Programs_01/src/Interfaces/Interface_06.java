package Interfaces;

interface Drawing
{
	void draw();
}
class Angle implements Drawing
{
	public void draw()
	{
		System.out.println("Draw a rectangle");
	}
}
class Circle implements Drawing
{
	public void draw()
	{
		System.out.println("Draw a circle");
	}
}

public class Interface_06 {

	public static void main(String[] args) {
		Drawing r = new Angle();
		r.draw();
		Drawing c = new Circle();
		c.draw();

	}

}
