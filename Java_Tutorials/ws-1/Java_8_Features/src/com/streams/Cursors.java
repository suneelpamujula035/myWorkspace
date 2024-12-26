package com.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Cursors {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Suneel","Lokesh","Karthik","Mahesh");
		Iterator<String> iterator = Arrays.asList("Suneel","Lokesh","Karthik","Mahesh").iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
