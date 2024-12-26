package java_programs_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintAllNonRepeatedCharacters_21 {

	public static void main(String[] args) {

		String x = "sillyspiders";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
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
			if(data.getValue() == 1)//data.getValue() >= 1 ----> For repeating characters
			{
				System.out.println(data.getKey());
			}
		}
	}

}
