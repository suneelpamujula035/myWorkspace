package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex_15 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("suneel", "sai", "sathish kumar", "babu");
		//names.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		names.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
	}

}
