package Collections_SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Example_01 {

	public static void main(String[] args) {

	       SortedSet<String> set = new TreeSet<String>(); 
	       
           set.add("Audi");  
           set.add("BMW");  
           set.add("Mercedes");  
           set.add("Volvo"); 
           
           System.out.println("The list of elements is given as:"); 
           
           for (Object object : set)
           {  
               System.out.println(object);  
           }  
          System.out.println("The first element is given as: " + set.first());     
          System.out.println("The last element is given as: " + set.last());  
          
          
          System.out.println("The respective element is given as: " + set.headSet("Volvo"));  
          System.out.println("The respective element is given as: " + set.tailSet("Audi"));  

	}

}
