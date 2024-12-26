package com.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_13 {

	public static void main(String[] args) {

		List<List<String>> listOfLists = Arrays.asList(
	            Arrays.asList("a", "b", "c"),
	            Arrays.asList("d", "e", "f"),
	            Arrays.asList("g", "h", "i")
	        );
	        
	        List<String> flattenedList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
	        System.out.println(flattenedList);
	}

}
