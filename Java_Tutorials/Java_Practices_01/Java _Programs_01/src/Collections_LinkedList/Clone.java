package Collections_LinkedList;

import java.util.LinkedList;

public class Clone {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Example");
		list.add("for");
		list.add("Clone");
		list.add("Method");
		
		System.out.println("First LinkedList :"+list);
		LinkedList<String> sec_list = new LinkedList<String>();
		sec_list = (LinkedList<String>) 
	    list.clone();
		System.out.println("Second LinkedList is "+sec_list);

	}

}
