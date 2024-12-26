package Collections_LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Add_All_End {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Welcome");
		list.add("to");
		list.add("Edureka");
		
		Collection<String> collect = new ArrayList<String>();
		collect.add("An");
		collect.add("Online");
		collect.add("Technology");
		collect.add("Training");
		collect.add("Center");
		
		System.out.println("The LinkedList before appending the collection is :  "+list);
		list.addAll(collect);
		System.out.println("The LinkedList after appending the collection is :  "+list);
		

	}

}
