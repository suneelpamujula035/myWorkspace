package Inheritance_Concepts;

class Calculator 
{
  public int add(int x, int y)
  {
	  return x+y;
  }
}
class AdvancedCalculator extends Calculator
{
	public int sub(int x, int y)
	  {
		  return x-y;
	  }
}

//Main class
public class Test extends AdvancedCalculator
{ 
	public int multi(int x, int y)
    {
	  return x*y;
    }
	
	public static void main(String[] args) {
		
		Test c1 = new Test();
		
		int result1 = c1.add(10, 50);
		int result2 = c1.sub(35, 5);
		int result3 = c1.multi(10, 2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
        Test c2 = new Test();
		
		int result4 = c2.add(50, 50);
		int result5 = c2.sub(35, 25);
		int result6 = c2.multi(10, 12);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);

	}

}
