package java_programs_04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PrintFirstNonRepeatedCharacter_22 {

	public static void main(String[] args) {

		String x = "sillyspiders";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		//First non repeating character is such a character which
		// a) Has a value 1
		// b) Comes first among the list of characters having value 1
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		while(i!=size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldval = map.get(y[i]);
				int newval = oldval + 1;
				map.put(y[i], newval);
			}
			i++;
		}
		Set<Entry<Character, Integer>> hmap = map.entrySet();
		for(Map.Entry<Character, Integer> data : hmap)
		{
			if(data.getValue() == 1)
			{
				System.out.println(data.getKey());
				System.exit(0);
			}
		}
	}

}
