package java_programs_05;

public class VarArgs_12 {

	int sum = 0;
	public void m1(int ... d)//This is also called as array (...)
	{
		System.out.println(d.length);
		System.out.println(d[3]);
	}
	public int sum(int...s)
	{
		
		for(int temp : s)
		{
			sum = sum + temp;
		}
		return sum;
	}
	public static void main(String ... args) {

		VarArgs_12 v = new VarArgs_12();
		System.out.println(v.sum(23,23,389,343,56,45));
		v.m1(232,34,22,44,4657,33);
	}

}
