package java_programs_05;

public class VarArgs_15 {

	public void m1(int [] a)
	{
		System.out.println("Inside m1 method of int param");
	}
	public void m1(double ... d)
	{
		System.out.println("Inside m1 method of var-args param");
	}
	public static void main(String[] args) {

		VarArgs_15 v = new VarArgs_15();
		v.m1(10,2,22,43,454,546,5767,98);
	}

}
