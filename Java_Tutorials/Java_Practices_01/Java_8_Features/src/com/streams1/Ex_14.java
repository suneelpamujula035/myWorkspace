package com.streams1;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

public class Ex_14 {

	public static void main(String[] args) {

		int arr[] = {4,6,2,9,23,15,17,5,13};
		
		OptionalInt findFirst = Arrays.stream(arr).distinct().boxed().sorted(Collections.reverseOrder()).skip(1).mapToInt(Integer::intValue).findFirst();
		if(findFirst.isPresent())
		{
			System.out.println("Second max element : "+findFirst.getAsInt());
		}else {
			System.out.println("Not present");
		}
		System.out.println(Arrays.stream(arr).min().getAsInt());
	}

}
