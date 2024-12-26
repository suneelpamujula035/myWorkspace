package Collections_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Example_01 {

	public static void main(String[] args) {

		  TreeSet<String> al=new TreeSet<String>();  //by default it takes traversing of elements
		  al.add("Ravi");                            //by default it printed elements in Alphabetical order
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator();
		  
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  

	      }

}
}
