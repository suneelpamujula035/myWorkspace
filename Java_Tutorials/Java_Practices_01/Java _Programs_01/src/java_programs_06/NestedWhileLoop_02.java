package java_programs_06;

public class NestedWhileLoop_02 {

	public static void main(String[] args) {

		int i=0, j=1;
		
		while(i<3)
		{
			while(j<=3)
			{
				System.out.print(j++ +" ");
			}
			System.out.print(i++ +" ");
			//System.out.println(i++,j++);
		}
	}

}
