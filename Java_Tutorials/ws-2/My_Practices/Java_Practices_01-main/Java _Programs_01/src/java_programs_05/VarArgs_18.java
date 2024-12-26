package java_programs_05;

public class VarArgs_18 {

	int sum(int a, int ...numbers)
	{
		System.out.println("1st sum method");
		int sum = a;
		for(int temp : numbers)
		{
			sum = sum + temp;
		}
		return sum;
	}
	int sum(int a, int b, int ...numbers)
	{
		System.out.println("2nd sum method");
		int sum = a+b;
		for(int temp : numbers)
		{
			sum = sum + temp;
		}
		return sum;
	}

public static void main(String[] args) {
	
	VarArgs_18 v = new VarArgs_18();
	//v.sum(10, 12,13);
}
}
