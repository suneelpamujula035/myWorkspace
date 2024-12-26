package com.map.streams;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex_01 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
        map.put("apple", 5);
        map.put("banana", 3);
        map.put("grapes", 3);
        map.put("orange", 8);
        map.put("mango", 2);
        
       //LinkedHashMap<String,Integer> linkedHashMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
        LinkedHashMap<String,Integer> linkedHashMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));

        System.out.println(linkedHashMap);
	}

}
