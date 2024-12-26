package java_programs_01;

public class Prime_Numbers_Example_03 {

	public static void main(String[] args) {
		
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(j==i)
				{
			        System.out.println( i);
				}
				if(i%j==0)
				{
					break;
				}
			}
		}

	}

}
