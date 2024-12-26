package java_programs_05;

public class VarArgs_11 {

	public void m1(int g[])
	{
		System.out.println("inside m1 method of varargs1 class");
	}
	public void add(int...xyz)
	{
		System.out.println("inside add method of varargs1 class");
	}
	public static void main(String[] args) {

		VarArgs_11 v = new VarArgs_11();
		v.add(12,34,3,55,45,67,87,63,79,344);
		int a[] = {34,5,67,80,43,232,464,575,684,242};
		v.m1(a);
		v.add(a);
	}

}
