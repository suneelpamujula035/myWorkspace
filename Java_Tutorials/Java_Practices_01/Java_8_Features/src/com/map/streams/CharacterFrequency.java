package com.map.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class CharacterFrequency {

	public static void main(String[] args) {

//		String str = "hello world";
//		str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((key,value)->System.out.println(key+" - "+value));
		List<String> list = Arrays.asList("Suneel","Suresh","Suneel","kalyan","jay");
		list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach((key,value)->System.out.println(key+" - "+value));
		Arrays.stream("pamujula suneel kumar".split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((key,value)->System.out.println(key+" - "+value));
	}

}
