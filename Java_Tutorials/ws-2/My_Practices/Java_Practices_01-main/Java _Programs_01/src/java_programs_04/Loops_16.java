package java_programs_04;

public class Loops_16 {

	public static void main(String[] args) {

		int a[] = {10,20,30,40,50};
		int size = a.length;
		int i = 0;
		int sum = 0;
		
//		while(i!=size)
//		{
//			sum = sum + a[i];
//			i++;
//		}
//		System.out.println(sum);
		
//		do
//		{
//			sum = sum + a[i];
//			i++;
//		}
//		while(i!=size);
//		System.out.println(sum);
		
		for(i=0; i<=size-1; i++)
		{
			System.out.println(a[i]);
			sum = sum + a[i];
		}
		System.out.println(sum);
		
//		for(int data : a)
//		{
//			sum = sum + data;
//		}
//		System.out.println(sum);
	}

}
