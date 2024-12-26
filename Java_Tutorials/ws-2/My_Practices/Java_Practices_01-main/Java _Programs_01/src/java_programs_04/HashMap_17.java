package java_programs_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_17 {

	public static void main(String[] args) {

		String x = "PAMUJULA_SUNEEL_KUMAR444";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		
		//HashMap stores the data in Random Order (based on Hash function)
		Map<Character, Integer> map = new HashMap<>();
		
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
