package java_programs_04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_19 {

	public static void main(String[] args) {

		String x = "PAMUJULA_SUNEEL_KUMAR";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		
		//TreeMap stores the data in Ascending Order(Alphabetical Order)
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		
		while(i!=size)
		{
			if(map.containsKey(y[i]))//When already key present in the map
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
			System.out.println(data.getKey()+"  -  "+data.getValue());
		}
	}

}
