package Interfaces;

interface  Polygon {
	   void area();
	   default void sides() {
	      System.out.println("Area of polygons");
	   }
	}

class Rectangle implements Polygon {
	   public void area() {
	      int length = 6;
	      int breadth = 5;
	      int area = length * breadth;
	      System.out.println("The area of the rectangle is "+area);
	   }

	   public void sides() {
	      System.out.println("4 sides.");
	   }
	}

class Square implements Polygon {
	   public void area() {
	      int length = 5;
	      int area = length * length;
	      System.out.println("The area of the square is "+area);
	   }
	   public void sides() {
		      System.out.println("4 sides.");
		   }
	}

public class Interface_05 {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
	      r1.area();
	      r1.sides();

	      Square s1 = new Square();
	      s1.area();
	      s1.sides();


	}

}
