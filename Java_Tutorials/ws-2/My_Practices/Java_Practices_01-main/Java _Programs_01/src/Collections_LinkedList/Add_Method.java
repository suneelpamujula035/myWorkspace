package Collections_LinkedList;

import java.util.LinkedList;

public class Add_Method {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("World");
		list.add("Message");
		list.add("From");
		list.add("Edureka");
		
		System.out.println("The recent list is :  "+list);
		list.add("New");
		list.add("Element");
		System.out.println("The current list is : "+list);



	}

}
