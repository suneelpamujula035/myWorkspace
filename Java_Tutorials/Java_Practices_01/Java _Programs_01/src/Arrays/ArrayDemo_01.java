package Arrays;

public class ArrayDemo_01 {

	public static void main(String[] args) {

		int a[] = new int[8];
		
		a[0] = 2;
		a[1] = 25;
		a[2] = 7;
		a[3] = 5;
		a[4] = 14;
		
		//For loop
		
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
		
		
		//For each loop
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
		System.out.println("a[7] is :"+a[7]);
	}

}
