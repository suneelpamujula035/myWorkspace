package java_programs_04;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FindMaximuOccuringCharacter_23 {

	public static void main(String[] args) {

		String x = "GOD_BLESS_SPIDERMAN";
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
		char maxkey = ' ';
		int maxval = 0;
		for(Map.Entry<Character, Integer> data : hmap)
		{
			if(data.getValue() > maxval)
			{
				maxval = data.getValue();
				maxkey = data.getKey();
			}
		}
		System.out.println(maxkey+"  -  "+maxval+" times occured");
	}

}
