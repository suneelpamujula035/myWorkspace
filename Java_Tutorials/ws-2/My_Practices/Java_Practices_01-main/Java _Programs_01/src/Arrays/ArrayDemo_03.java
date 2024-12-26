package Arrays;

public class ArrayDemo_03 {

	public static void main(String[] args) {

		int arr[][] = new int[3][3];
		
		arr[0][0] = 45;
		arr[0][1] = 27;
		arr[0][2] = 32;
		arr[1][0] = 44;
		arr[1][1] = 16;
		arr[1][2] = 83;
		arr[2][0] = 97;
		arr[2][1] = 78;
		arr[2][2] = 54;
		
		for(int x[] : arr)
		{
			for(int y : x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
