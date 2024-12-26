package Arrays;

public class ArrayDemo_04 {

	public static void main(String[] args) {

		int arr[][] = {{45,78,52,12,66},{45,78},{25,36,56,89,88},{77,66},{47,20,68,79,99},{45,78,52,46,77},{22,21}};
		
		for(int[] x : arr)
		{
			for(int y : x)
			{
				System.out.print(y+"  ");
			}
			System.out.println();
		}
	}

}
