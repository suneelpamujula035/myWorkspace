package com.map.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex_03 {

	public static void main(String[] args) {

		String result = Arrays.stream("ababdc".split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst().get();
		System.out.println(result);
	}

}
