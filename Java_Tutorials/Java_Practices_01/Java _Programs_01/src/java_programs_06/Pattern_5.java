package java_programs_06;

public class Pattern_5 {

	public void print(int rows)
	{
		int i=1, j=1;
		
		for(i=1; i<rows; i++)
		{
			for(j=1; j<=(rows-i); j++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		Pattern_5 p = new Pattern_5();
		p.print(8);
	}

}
