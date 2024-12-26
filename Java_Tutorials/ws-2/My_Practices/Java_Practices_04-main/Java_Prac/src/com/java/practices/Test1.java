package com.java.practices;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		String input = "aabbb";
		char[] inputArray = input.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character data : inputArray) {
			if (charMap.containsKey(data)) {
				int oldval = charMap.get(data);
				int newval = oldval + 1;
				charMap.put(data, newval);
			} else {
				charMap.put(data, 1);
			}
		}
		Set<Entry<Character, Integer>> resultMap = charMap.entrySet();
		for (Map.Entry<Character, Integer> data : resultMap) {
			String result = data.getKey() + "  -  " + data.getValue();
			System.out.println(result);
		}

	}

}
