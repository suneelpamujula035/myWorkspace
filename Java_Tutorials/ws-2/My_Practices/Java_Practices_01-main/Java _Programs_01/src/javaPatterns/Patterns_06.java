package javaPatterns;

public class Patterns_06 {

	public static void main(String[] args) {

		int i,j;
		
		for(i=1; i<=5;i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
//for(int i=1; i<=5; i++)  (or)
//for(int i=0; i<5; i++)
