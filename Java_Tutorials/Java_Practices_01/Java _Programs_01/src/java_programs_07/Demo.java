package java_programs_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		String x = "gudur railway station i found my friend";
		char[] y = x.toCharArray();
		
		int i=0;
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		while(i!=y.length)
		{
			if(map.containsKey(y[i]) == false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldval = map.get(y[i]);
				map.put(y[i], oldval+1);
			}
			i++;
		}
		
		Set<Entry<Character, Integer>> lmap = map.entrySet();
		
		for(Map.Entry<Character, Integer> data : lmap)
		{
			System.out.println(data.getKey()+"  -  "+data.getValue());
		}
	}

}
