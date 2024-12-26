package java_programs_07;

public class Prac {

	public static void main(String[] args) {

		
		int givenNumber = 11;
		
	
		int i,j;
		
		for( i=1; i<=givenNumber; i++)
		{
			int count = 0;
			for( j=1; j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(j+" is a Prime Number");
			}
			
		}
		
		
		
	}

}
