package com.streams;

import java.util.Arrays;
import java.util.List;

public class Ex_14 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("suneel kumar", "sai krishna", "sathish kumar", "surendra babu");
		names.stream().map(x->x.split(" ")).map(x->x[x.length-1]).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(2,5,6,3,9,8,4);
		System.out.println(numbers.stream().filter(i->i%2!=0).mapToInt(i->i*i).sum());
	}
}
