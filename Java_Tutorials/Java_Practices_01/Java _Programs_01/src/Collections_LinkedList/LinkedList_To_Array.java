package Collections_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList_To_Array {

	public static void main(String[] args) {

		LinkedList<String> courseslist = new LinkedList<String>();
		
		courseslist.add("Java");
		courseslist.add("Python");
		courseslist.add("DevOps");
		courseslist.add("Hadoop");
		courseslist.add("AWS");
		
		int size = courseslist.size();
	    System.out.println("Size of LinkedList = "+size);
	    String[] numbers = new String[size];
	    numbers = courseslist.toArray(numbers);
	    System.out.println("Elements of array are : ");
	    System.out.println(Arrays.deepToString(numbers));
		
	}

}
