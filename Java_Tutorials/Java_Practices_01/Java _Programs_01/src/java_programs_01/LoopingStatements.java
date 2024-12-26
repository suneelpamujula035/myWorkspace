package java_programs_01;

public class LoopingStatements {

	public static void main(String[] args) {

		int arr[] = {34,76,44,86,18,59,79,24,63,88,52};
		int i = 0;
		int sum = 0;
		
		while(i!=arr.length)
		{
			System.out.println(arr[i]);
			sum = sum+arr[i];
			i++;
		}
		System.out.println("Sum of arry is : "+sum);
		System.out.println("---------------------------------------------------");
		int j = 87;
		do {
			System.out.println(j);
			j++;
		}
		while(j<50);
		System.out.println("----------------------------------------------------");
		
		for(int k=0; k<arr.length; k++)
		{
			System.out.println(arr[k]);
		}
		
		System.out.println("----------------------------------------------------");
		for(int x : arr)
		{
			System.out.println(x);
		}

	}

}
