package java_programs_04;

public class PangramProgram_15 {

	public static void main(String[] args) {

		// THE QUICK BROWN FOX JUMPS OVER A LAZY DOG
		String x = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		x = x.replace(" ", "");
		char[] y = x.toCharArray();
		int size = y.length;//33
		int a[] =  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int i = 0;
		while(i!=size)
		{
			int index = y[i]-65;//84-65=19   65=A (ASCII TABLE)
			a[index] = 1;//a[19] = 1
			i++;
		}
	
		for(i=0; i<a.length; i++)
		{
			if(a[i]!=1)
			{
				System.out.println("Not a pangram");
				System.exit(i);
			}
		}
		System.out.println("Pangram");
		
	}

}
