package Collections_LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example_01 {

	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<String>();   //elements come in order
		                                                           //removing of duplicate elements
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("B");
		set.add("E");
		set.add("Y");
		set.add("K");
		
		System.out.println(set.size());
		System.out.println(set);
		
		Iterator<String> i = set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
