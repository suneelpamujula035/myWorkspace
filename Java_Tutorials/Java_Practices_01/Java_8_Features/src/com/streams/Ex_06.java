package com.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_06 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10,20,34,56,20,79,95,12,43,79,53);
		// To find duplicates in list
		list.stream().distinct().forEach(System.out::println);
		
		// To find the size of the list
		System.out.println("Size of the List : "+list.stream().count());
		
		
		System.out.println(list);
		System.out.println("----------------------");
//		List<Integer> sortedMarks = marks.stream().sorted((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
		list.stream().sorted().forEach(System.out::println);
		System.out.println("------------");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		System.out.println("------------");
		list.stream().distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
