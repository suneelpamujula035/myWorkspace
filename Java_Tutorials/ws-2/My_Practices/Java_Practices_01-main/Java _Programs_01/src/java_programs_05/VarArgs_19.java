package java_programs_05;

public class VarArgs_19 {

	public void m1(Object ...o)
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args) {

		VarArgs_19 v = new VarArgs_19();
		v.m1(new Object[] {null});
	}

}
