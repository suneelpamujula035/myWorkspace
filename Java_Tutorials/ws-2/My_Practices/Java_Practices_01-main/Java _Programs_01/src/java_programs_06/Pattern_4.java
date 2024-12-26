package java_programs_06;

public class Pattern_4 {

	public void printPattern(int rows)
	{
		int i=1, j=1;
		for(i=1; i<=rows; i++)
		{
			for(j=1; j<=rows; j++)
			{
				if((i+j)<=rows)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		Pattern_4 p = new Pattern_4();
		p.printPattern(5);
	}

}
