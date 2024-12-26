package java_programs_01;

public class GeneratingUniqueNumbers {

	public static void main(String[] args) {

		int count = 0;
		
		for(int i=1; i<=3; i++)              //number(123) -----> First digit
		{
			for(int j=1; j<=3; j++)          //Second digit
			{
				for(int k=1; k<=3; k++)      //Third digit
				{
					if(i!=j && i!=k && j!=k)
					{
						count++;
						System.out.println(i+""+j+""+k);
					}
				}
			}
		}
		System.out.println("Different ways to arrange : "+count);
	}

}
