package java_programs_04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;import javax.xml.validation.Validator;

public class HashMap_17 {

	public static void main(String[] args) {

		
//		  String x = "PAMUJULA_SUNEEL_KUMAR444"; 
//		  char[] y = x.toCharArray();
//		  int size = y.length;
//		  int i = 0;
//		 
//
//		// HashMap stores the data in Random Order (based on Hash function)
//		Map<Character, Integer> map = new HashMap<>();
//
//		while (i != size) {
//			if (map.containsKey(y[i]) == false)// When Keys are not present in the map
//			{
//				map.put(y[i], 1);
//			} else {
//				int oldval = map.get(y[i]);
//				int newval = oldval + 1;
//				map.put(y[i], newval);
//			}
//			i++;
//		}
//		Set<Entry<Character, Integer>> hmap = map.entrySet();
//		for (Map.Entry<Character, Integer> data : hmap) {
//			System.out.println(data.getKey() + "  -  " + data.getValue());
//		}
		
		String x = "PAMUJULA_SUNEEL_KUMAR444";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		
		HashMap<Character, Integer> map = new HashMap<>();
		while(i!=size)
		{
			if(map.containsKey(y[i]))
			{
				map.put(y[i], map.get(y[i])+1);
			}else {
				map.put(y[i], 1);
			}
			i++;
		}
//		for(Map.Entry<Character, Integer> data : map.entrySet())
//		{
//			System.out.println(data.getKey()+" - "+data.getValue());
//		}
		map.entrySet().forEach((data)->System.out.println(data.getKey()+" - "+data.getValue()));
		System.out.println("---------------------");
		
		x.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((key,value)->System.out.println(key+" - "+value));
		System.out.println("---------------------");
		Arrays.stream(x.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((key,value)->System.out.println(key+" - "+value));
	}

}
