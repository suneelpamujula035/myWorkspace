package Collections_LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Add_All_Head {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Welcome");
		list.add("Edureka");
		
		Collection<String> collect = new ArrayList<String>();
		collect.add("To");
		collect.add("The");
		collect.add("Most");
		collect.add("Popular");
		collect.add("Online");
		collect.add("Technology");
		collect.add("Training");
		collect.add("Center");
		
		System.out.println("The LinkedList is :   "+list);
		
		list.addAll(1,collect);
		
		System.out.println("The new LinkedList is :   "+list);


	}

}
