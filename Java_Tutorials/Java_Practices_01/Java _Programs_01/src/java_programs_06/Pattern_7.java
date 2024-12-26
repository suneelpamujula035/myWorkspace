package java_programs_06;

public class Pattern_7 {

	public void print(int rows)
	{
		int i=1, j=1;
		
		for(i=rows; i>=1; i--)
		{
			for(j=1; j<=(rows-i); j++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=2*i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		Pattern_7 p = new Pattern_7();
		p.print(5);
	}

}
