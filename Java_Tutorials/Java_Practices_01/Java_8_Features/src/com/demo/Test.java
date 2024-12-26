package com.demo;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList obj = new ArrayList<>();
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add(1, "D");
		System.out.println(obj);
		
		String s1 = "      Hello    world"                 ;
		String s2 = "hello";
		
		System.out.println(s1.trim());
	}

}
