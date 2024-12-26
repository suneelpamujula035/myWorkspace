package java_programs_05;

public class VarArgs_16 {

	public void m1(int a, int ... numbers)
	{
		System.out.println(a);
		for(int temp : numbers)
		{
			System.out.println("Coming from var-args type : "+temp);
		}
	}
	public static void main(String[] args) {

		VarArgs_16 v = new VarArgs_16();
		v.m1(10,2,22,43,454,546,5767,98);
	}

}
