package java_programs_04;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PrintDuplicateCharacters_24 {

	public static void main(String[] args) {

		String x = "SILLYSPIDERS";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		while(i!=size)
		{
			if(map.containsKey(y[i]))
			{
				int oldval = map.get(y[i]);
				int newval = oldval + 1;
				map.put(y[i], newval);
			}
			else
			{
				map.put(y[i], 1);
			}
			i++;
		}
		Set<Entry<Character, Integer>> hmap = map.entrySet();
		
		for(Map.Entry<Character, Integer> data : hmap)
		{
			if(data.getValue() > 1)
			{
				System.out.println(data.getKey()+"  -  "+data.getValue());
			}
		}
	}

}
