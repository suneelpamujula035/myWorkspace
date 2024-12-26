package com.map.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex_02 {

	public static void main(String[] args) {

		List<String> cities = Arrays.asList("Pune", "Pune", "Goa", "Delhi", "London", "London", "Pune");
//		Map<String, Long> map = cities.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		Long count = map.values().stream().min(Long::compare).get();
//		map.entrySet().stream().filter(entry->entry.getValue()==count).forEach(System.out::println);
		
		Map<String, Long> map = cities.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Long count = map.values().stream().min(Long::compare).get();
		map.entrySet().stream().filter(entry->entry.getValue()==count).map(Map.Entry::getKey).forEach(System.out::println);
	}

}
