package java_programs_04;

public class CountVowelsConsonantsAndSpecialSymbols_10 {

	public static void main(String[] args) {

		String x = "SUNeeL KUmAr@#";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		int Vowels = 0;
		int Consonants = 0;
		int SpecialSymbols = 0;
		
		while(i!=size)
		{
			if(y[i]>='A'||y[i]>='a' && y[i]<='Z'||y[i]<='z')
			{
				if(y[i]=='A'||y[i]=='a' || y[i]=='E'||y[i]=='e' || y[i]=='I'||y[i]=='i' || y[i]=='O'||y[i]=='o' || y[i]=='U'||y[i]=='u')
				{
					Vowels++;
				}
				else
				{
					Consonants++;
				}
			}
			else
			{
				SpecialSymbols++;
			}
			i++;
		}
		System.out.println(y);
		System.out.println("Number of Vowels : "+Vowels);
		System.out.println("Number of Consonants : "+Consonants);
		System.out.println("Number of SpecialSymbols : "+SpecialSymbols);
	}

}
