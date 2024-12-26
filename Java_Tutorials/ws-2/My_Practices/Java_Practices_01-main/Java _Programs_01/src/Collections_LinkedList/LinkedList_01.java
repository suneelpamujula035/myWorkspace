package Collections_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_01 {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        //Traversing the list of elements in reverse order  
        Iterator itr=ll.descendingIterator();  
        while(itr.hasNext())  
        {  
            System.out.println(itr.next());  
        }  

	}

}
