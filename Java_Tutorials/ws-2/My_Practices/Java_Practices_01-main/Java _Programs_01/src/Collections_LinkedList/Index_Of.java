package Collections_LinkedList;

import java.util.LinkedList;

public class Index_Of {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Using");
		list.add("Index");
		list.add("Of");
		list.add("Method");
		
		System.out.println("LinkedList : "+list);
		
		System.out.println("The first occurance of Using at index : "+list.indexOf("Using"));
		System.out.println("The first occurance of Method at index : "+list.indexOf("Method"));

	}

}
