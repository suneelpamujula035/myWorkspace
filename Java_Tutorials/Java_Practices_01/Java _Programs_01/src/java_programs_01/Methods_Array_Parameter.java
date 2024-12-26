package java_programs_01;

public class Methods_Array_Parameter {

	int sum=0;
	public void calSum(int[] temp)
	{
		for(int x : temp)
		{
			System.out.println(x);
			sum = sum+x;
		}
		System.out.println("Array of sum is : "+sum);
	}
	public static void main(String[] args) {

		int arr[] = {34,87,56,79,22,86,46,95};
		Methods_Array_Parameter m = new Methods_Array_Parameter();
		m.calSum(arr);
			}

}
