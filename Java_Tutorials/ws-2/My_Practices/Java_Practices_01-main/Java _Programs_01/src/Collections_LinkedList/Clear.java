package Collections_LinkedList;

import java.util.LinkedList;

public class Clear {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Edureka");
		list.add("Online");
		list.add("Training");
		list.add("Institue");
		
		System.out.println("LinkedList before clearing :  "+list);
		
		list.clear();
		
		System.out.println("Cleared all elements : "+list);
		
		list.add("Now");
		list.add("tied");
		list.add("up");
		list.add("with");
		list.add("NIT");
		list.add("Warangal");
		
		System.out.println("LinkedList after adding elements to empty list : "+list);

	}

}
