package Collections_LinkedList;

import java.util.LinkedList;

public class Remove {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Pineapple");
		
		System.out.println("LinkedList : "+list);
		list.remove(2);
		System.out.println("Final LinkedList : "+list);

	}

}
