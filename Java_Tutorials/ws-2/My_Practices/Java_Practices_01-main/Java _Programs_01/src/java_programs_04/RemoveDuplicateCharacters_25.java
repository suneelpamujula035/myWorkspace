package java_programs_04;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class RemoveDuplicateCharacters_25 {

	public static void main(String[] args) {

		String x = "SILLYSPIDERS";
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
		Set<Entry<Character, Integer>> hmap = map.entrySet();
		
		//String result = "";
		for(Map.Entry<Character, Integer> data : hmap)
		{
				//result = result + data.getKey();
			System.out.print(data.getKey());
		}
		//System.out.println(result);
	}

}
