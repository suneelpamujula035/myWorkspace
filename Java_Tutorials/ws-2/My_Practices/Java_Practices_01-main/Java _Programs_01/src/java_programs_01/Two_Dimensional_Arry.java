package java_programs_01;

public class Two_Dimensional_Arry {

	public static void main(String[] args) {
		
		int a[][]= { {12,20,25}, {30,40,45}, {50,60,65}, {70,75,80}, {85,90,100} };
		
		for(int i[] : a)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
