package java_programs_04;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CheckIfAStringHasAllUniqueCharacters_20 {

	public static void main(String[] args) {

		String x = "spiderman";//spiderman, sillyspiders
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		
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
		Set<Entry<Character, Integer>> lmap = map.entrySet();
		for(Map.Entry<Character, Integer> data : lmap)
		{
			if(data.getValue()>1)
			{
				System.out.println("Does not contain all unique characters");
				System.exit(0);
			}
		}
		System.out.println("Contains all unique characters");
	}

}
