package java_programs_06;

public class NestedDoWhileLoop_03 {

	public static void main(String[] args) {

		int i=1, j=3;
		
		do {
			do {
				System.out.print(j+" ");
				j--;
			}while(j>0);
			i++;
			System.out.print(i+" ");
		}while(i<4);
	}

}
