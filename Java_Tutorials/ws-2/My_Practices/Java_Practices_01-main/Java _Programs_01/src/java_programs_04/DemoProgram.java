package java_programs_04;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoProgram {

	public static void main(String[] args) {
		
		String x = "PAMUJULA_SUNEEL_KUMAR";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		
		Map<Character, Integer> m = new TreeMap<>();
		while(i!=size)
		{
			if(m.containsKey(y[i]))
			{
				int oldval = m.get(y[i]);
				int newval = oldval+1;
				m.put(y[i], newval);
			}
			else
			{
				m.put(y[i], 1);
			}
			i++;
		}
		Set<Entry<Character, Integer>> hmap = m.entrySet();
		for(Map.Entry<Character, Integer> data : hmap)
		{
			System.out.println(data.getKey()+" - "+data.getValue());
		}
	}
}
