package java_programs_04;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_19 {

	public static void main(String[] args) {

//		String x = "PAMUJULA_SUNEEL_KUMAR";
//		char[] y = x.toCharArray();
//		int size = y.length;
//		int i = 0;
//
//		// TreeMap stores the data in Ascending Order(Alphabetical Order
//		Map<Character, Integer> map = new TreeMap<Character, Integer>();
//
//		while (i != size) {
//			if (map.containsKey(y[i]))// When Keys are present in the map
//			{
//				map.put(y[i], map.get(y[i]) + 1);
//			} else {
//				map.put(y[i], 1);
//			}
//			i++;
//		}
//		for (Map.Entry<Character, Integer> data : map.entrySet()) {
//			System.out.println(data.getKey() + "  -  " + data.getValue());
//		}
		
		String x = "PAMUJULA_SUNEEL_KUMAR";
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for(char data : x.toCharArray())
		{
			if(map.containsKey(data))
			{
				map.put(data, map.get(data)+1);
			}else {
				map.put(data, 1);
			}
		}
		map.entrySet().stream().forEach((data)->System.out.println(data.getKey()+" - "+data.getValue()));
		map.entrySet().forEach((data)->System.out.println(data.getKey()+" - "+data.getValue()));
//		for (Map.Entry<Character, Integer> data : map.entrySet()) {
//			System.out.println(data.getKey() + "  -  " + data.getValue());
//		}
		
	}

}
