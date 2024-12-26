package Oops_Concepts;

public class Methods {
	
	public void normal_method()
	{
	int a = 10;
	int b = 30;
	int c = a+b;
	int e= b-a;
	int d=a*b;
	
		System.out.println(c);
		System.out.println(d);
		System.out.println(e); 
	}
	public static void static_method()
	{
	int a = 10;
	int b = 20;
	int c = b-a;
	
		System.out.println(c);
	}

	public static void main(String[] args) {
		Methods m1 = new Methods();
		m1.normal_method();
		m1.static_method();
		
		

	}

}
