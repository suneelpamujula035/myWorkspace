package Collections_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Example_02 {

	public static void main(String[] args) {
		
        System.out.println("-------------For Strings----------------");


		 TreeSet<String> set=new TreeSet<String>(); 
		 
         set.add("Ravi");  
         set.add("Vijay");  
         set.add("Ajay");  
         set.add("Suresh");
         set.add("Karthik");
         set.add("Prasad");
         
         System.out.println("Traversing element through Iterator in descending order");  
         
         Iterator<String> i=set.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
         System.out.println("Highest Value: "+set.pollFirst());  
         System.out.println("Lowest Value: "+set.pollLast());  
         

         System.out.println("-------------For Integers----------------");
         
         TreeSet<Integer> set1=new TreeSet<Integer>();  
         set1.add(24);  
         set1.add(66);  
         set1.add(12);  
         set1.add(15);  
         System.out.println("Highest Value: "+set1.pollFirst());  
         System.out.println("Lowest Value: "+set1.pollLast());  


	}

}
