package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_ArrayList {

	public static void main(String[] args) {
		System.out.println("-------------Sorting Fruits---------------");

		//Creating the list of fruits
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		
		//Sorting the list
		Collections.sort(list1);	
		//Traversing the list through For-each loop
		for(String fruit:list1)
		{
			System.out.println(fruit);
		}
		System.out.println("-------------Sorting Numbers---------------");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(25);
		list2.add(46);
		list2.add(48);
		list2.add(12);
		list2.add(8);
		list2.add(2);
		
		
		//Sorting the list
		Collections.sort(list2);	
	    //Traversing the list through For-each loop
		for(Integer number:list2)
		{
			System.out.println(number);
		}
		System.out.println("List size :  "+list2.size());
		
		


	}

}
