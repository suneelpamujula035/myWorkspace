package java_programs_06;

public class Test {

	int i = 0;
	public void add(int n, int[] arr)
	{
		int num=0;
		int length1 = arr.length;
		int sum[] = new int[length1];
				
		while(i!=length1)
		{
			sum[i] = arr[i-(i+1)];
			i++;
		}
		int size = sum.length;
		while(i!=size)
		{
			num = num+sum[i];
			i++;
		}
		
	}
	public static void main(String[] args) {

		int[] b = {10,17,7,12,14};
		Test t = new Test();
		t.add(5, b);
	}

}
