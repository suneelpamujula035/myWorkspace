package Polymorphism;

public class Method_Overloading_03 {
	
	 void addition()
	{
	int a = 10;
	int b = 25;
	int c = a+b;
	System.out.println("Sum= "+c);
	}
	
	 void addition(int x, int y)
		{
			int z = x+y;
			System.out.println("Sum= "+z);
		}


	public static void main(String[] args) {
		
		Method_Overloading_03 obj = new Method_Overloading_03();
		obj.addition();
		obj.addition(20, 60);

	}

}
