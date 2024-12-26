package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSorting {

	public static void main(String[] args) {
		
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("David", 22);
		unsortedMap.put("Bob", 25);
		unsortedMap.put("Alice", 30);
		unsortedMap.put("Charlie", 35);
		unsortedMap.put("Eve", 28);
		
		//Sorting HashMap by keys
//		ArrayList<String> list = new ArrayList<>(unsortedMap.keySet());
//		Collections.sort(list);
//		for(String data : list)
//		{
//			System.out.println(data+" - "+unsortedMap.get(data));
//		}
		
		//Sorting HashMap by values
		List<Map.Entry<String, Integer>> list = new ArrayList<>(unsortedMap.entrySet());
		Collections.sort(list, (key1, key2)->key1.getKey().compareTo(key2.getKey()));
		for(Map.Entry<String, Integer> data : list)
		{
			System.out.println(data.getKey()+" - "+data.getValue());
		}
	
	}
}
