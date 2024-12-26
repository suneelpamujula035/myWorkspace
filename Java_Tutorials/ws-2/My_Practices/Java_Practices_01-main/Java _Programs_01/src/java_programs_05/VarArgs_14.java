package java_programs_05;

public class VarArgs_14 {

	public void m1(int a, int b, int c)
	{
		System.out.println("Inside m1 method of int param");
	}
	public void m1(byte ... b)
	{
		System.out.println("Inside m1 method of var-args param");
	}
	public static void main(String[] args) {

		VarArgs_14 v = new VarArgs_14();
		byte b = 10;
		v.m1(b,b,b,b,b);
	}

}
