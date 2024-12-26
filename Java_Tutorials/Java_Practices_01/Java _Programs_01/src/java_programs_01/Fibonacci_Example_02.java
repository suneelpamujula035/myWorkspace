package java_programs_01;

public class Fibonacci_Example_02 {
	
	static int n1=0,n2=1,n3=0;
	static void printFiboncci(int count)
	{
		if(count>0)
			n3=n1+n2;
		    n1=n2;
		    n2=n3;
		    System.out.println(""+n3);
		    printFiboncci(count-1);
	}


	public static void main(String[] args) {
		
		int count=10;
		System.out.println(n1+""+n2);
		printFiboncci(count-2);
		
		

	}

}
