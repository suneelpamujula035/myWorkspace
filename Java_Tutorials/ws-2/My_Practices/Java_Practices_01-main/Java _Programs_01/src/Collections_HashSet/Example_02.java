package Collections_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Example_02 {

	public static void main(String[] args) {

        HashSet<String> h = new HashSet<String>(); 
        
        h.add("India"); 
        h.add("Australia"); 
        h.add("Sidney");
        h.add("Switzerland");
        h.add("Paris");
        h.add("South Africa"); 
        h.add("India");// adding duplicate elements 
  
        // Displaying the HashSet 
        System.out.println("Size is :"+h.size());
        System.out.println(h); 
        System.out.println("List contains India or not:" + h.contains("India")); 
  
        // Removing items from HashSet using remove() 
        h.remove("Australia"); 
        System.out.println("List after removing Australia:"+h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 

	}

}
