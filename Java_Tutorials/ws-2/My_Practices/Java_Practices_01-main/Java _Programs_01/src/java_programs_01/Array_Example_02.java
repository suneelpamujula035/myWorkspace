package java_programs_01;

public class Array_Example_02 {

	public static void main(String[] args) {
		
        int a[]=new int[8];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		
		for(int i=0;i<=4;i+=2)
		{
			System.out.println(a[i]);
		}
		
		/*for(int i:a)
		{
			System.out.println(i);
		}*/
		


	}

}
