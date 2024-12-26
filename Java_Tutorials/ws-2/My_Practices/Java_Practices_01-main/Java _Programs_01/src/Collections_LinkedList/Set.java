package Collections_LinkedList;

import java.util.LinkedList;

public class Set {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Pineapple");
		
		System.out.println("LinkedList : "+list);
		System.out.println("The object that is replaced is : "+list.set(2, "Kiwi"));
		System.out.println("The object that is replaced is : "+list.set(3, "Orange"));
		System.out.println("The new LinkedList is : "+list);
	}

}
