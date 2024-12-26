package Collections_LinkedList;

import java.util.LinkedList;

public class Add_By_Index {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("How");
		list.add("are");
		list.add("?");
		list.add("to");
		list.add("Edureka");
		
		System.out.println("The previous list is :  "+list);
		list.add(2,"You");
		list.add(4,"Welcome");
		System.out.println("The current list is : "+list);


	}

}
