package Collections_LinkedList;

import java.util.LinkedList;

public class Size {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Pineapple");
		
		System.out.println("LinkedList : "+list);
		System.out.println("The size of the LinkedList is : "+list.size());
	}

}
