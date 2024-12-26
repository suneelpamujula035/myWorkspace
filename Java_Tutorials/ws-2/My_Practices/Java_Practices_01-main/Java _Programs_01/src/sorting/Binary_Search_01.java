package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Binary_Search_01 {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		l.add("G");
		l.add("v");
		l.add("T");
		l.add("s");
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println("After sorting : ");
		System.out.println(l);
//		System.out.println(Collections.binarySearch(l, "W"));
//		System.out.println(Collections.binarySearch(l, "K"));
//		System.out.println(Collections.binarySearch(l, "a"));
//		System.out.println(Collections.binarySearch(l, "f"));//if you pass any element it shows -6 only
//		System.out.println(Collections.binarySearch(l, "b"));
//		System.out.println(Collections.binarySearch(l, "A"));
		int result = Collections.binarySearch(l, "l");
		if(result>=0)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
		
	}

}
