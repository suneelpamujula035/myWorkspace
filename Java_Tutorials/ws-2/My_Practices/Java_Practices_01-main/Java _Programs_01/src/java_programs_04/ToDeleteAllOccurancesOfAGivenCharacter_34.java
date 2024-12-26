package java_programs_04;

public class ToDeleteAllOccurancesOfAGivenCharacter_34 {

	public static void main(String[] args) {

		String x = "SPIDERSLIES";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		char key = 'S';
		String result = "";
		
		while(i!=size)
		{
			if(y[i]!=key)
			{
				result = result + y[i];
			}
			i++;
		}
		System.out.println(result);
		
		
		
	}

}
