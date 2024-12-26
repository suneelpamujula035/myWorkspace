package java_programs_04;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class RemoveWhiteSpacesInAString_27 {

	public static void main(String[] args) {

		String x = "JOIN ABC SKILLED	GET	PLACED	OR	TAKE COMPLETE REFUND";// Spaces using TAB
		//x = x.replaceAll(" ", "");//For removing only spacebar white spaces
		//x = x.replaceAll("\\t", "");//For removing only tab white spaces
		x = x.replaceAll("\\s", "");//For removing both spacebar and tab white spaces
		// (\\t and \\s) are escape sequences
		System.out.println(x);
		
		
	}

}
