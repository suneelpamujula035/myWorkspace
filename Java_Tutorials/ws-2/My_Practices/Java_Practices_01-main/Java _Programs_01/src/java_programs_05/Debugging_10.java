package java_programs_05;
class Maths{
	
	public int add(int a, int b)
	{
		return a+b;
	}
	public int substract(int a, int b)
	{
		return a-b;
	}
	public int multiply(int a, int b)
	{
		return a*b;
	}
	public int division(int a, int b)
	{
		return a/b;
	}
}
public class Debugging_10 {

	public static void main(String[] args) {

		Maths m = new Maths();
		int addResult = m.add(23, 34);
		System.out.println("Addition result : "+addResult);
		int substractResult = m.substract(45, 20);
		System.out.println("Substraction result : "+substractResult);
		int multiplyResult = m.multiply(7, 43);
		System.out.println("Multiplication Result : "+multiplyResult);
		int divisionResult = m.division(42, 2);
		System.out.println("Division Result : "+divisionResult);
		
		System.out.println("*******************************************");
		Maths m1 = new Maths();
		int addResult1 = m1.add(23, 87);
		System.out.println("Addition result : "+addResult1);
		int substractResult1 = m1.substract(890, 276);
		System.out.println("Substraction result : "+substractResult1);
		int multiplyResult1 = m1.multiply(35, 12);
		System.out.println("Multiplication Result : "+multiplyResult1);
		int divisionResult1 = m1.division(150, 5);
		System.out.println("Division Result : "+divisionResult1);
	}

}
