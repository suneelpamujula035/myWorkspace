package com.streams1;

import java.util.Arrays;
import java.util.List;

public class Ex_15 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Suneel Kumar", "Sai Krishna", "Prasad Babu");
		list.stream().map(m->m.split(" ")).map(m->m[m.length-1]).forEach(System.out::println);
	}

}
