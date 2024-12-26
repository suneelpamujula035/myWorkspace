package java_programs_04;

public class VerifyIfOneStringIsARotationOfAnotherString_33 {

	public static void main(String[] args) {

//	ORIGINAL STRING   ->	ARADHYA
//	
//		                   KEY STRINGS ->
//	ROTATIONAL STRING ->	RADHYAA 
//	                        ADHYAAR
//	                        DHYAARA
//	                        HYAARAD
//	                        
//	NON-ROTATIONAL STRING ->RAADHYA

		String originalString = "carrace";
		String keyString = "racecar";
		
		String newString = originalString.concat(originalString);
		
		if(newString.contains(keyString))
		{
			System.out.println("Rotational String");
		}
		else
		{
			System.out.println("Non-Rotational String");
		}
	}

}
