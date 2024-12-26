package java_programs_06;

public class Pattern_8 {

	int i=1, j=1;

	public void pyramid(int rows)
	{
		
		for(i=1; i<=rows-1; i++)
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
	public void reversePyramid(int rows)
	{
		
		for(i=rows; i>=1; i--)//i=rows-1
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

		Pattern_8 p = new Pattern_8();
		p.pyramid(8);
		p.reversePyramid(8);
	}

}
