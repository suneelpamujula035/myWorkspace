package java_programs_04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap_18 {

	public static void main(String[] args) {

		String x = "PAMUJULA_SUNEEL_KUMAR ";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		
		//LinkedHashMap stores the data in same Sequence as the Input
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		while(i!=size)
		{
			if(map.containsKey(y[i]) == false)//When Keys are not present in the map
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
			System.out.println(data.getKey()+"  -  "+data.getValue());
		}
	}

}
