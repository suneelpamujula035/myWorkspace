package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Using_Iterator {        // Iterating ArrayList using Iterator

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Grapes");
		list.add("Banana");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())         // Iterating ArrayList using While Loop
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------------OR--------------");
		
		for(String s:list)                // Iterating  ArrayList using For Each Loop
		{
			System.out.println(s);
		}

	}

}
