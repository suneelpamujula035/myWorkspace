package Collections_ArrayList;

import java.util.ArrayList;

public class ArrayList_Using_ForLoop {            // Java ArrayList example

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Grapes");
		list.add("Stroberry");
		list.add("PineApple");
		
		System.out.println("Size of the list is :  "+list.size());
		
		System.out.println(list);
		
		for(String s:list)              
		{
			System.out.println(s);
		}

	}

}
