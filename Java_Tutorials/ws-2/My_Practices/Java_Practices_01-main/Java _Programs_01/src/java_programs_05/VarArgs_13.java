package java_programs_05;

public class VarArgs_13 {

	public void m1(int a)
	{
		System.out.println("Inside m1 method of int param");
	}
	public void m1(int ... a)
	{
		System.out.println("Inside m1 method of var-args param");
	}
	public static void main(String[] args) {

		VarArgs_13 v = new VarArgs_13();
		v.m1(56,676,878);
	}

}
