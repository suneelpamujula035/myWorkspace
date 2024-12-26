package Collections_Hashtable;

import java.util.Hashtable;
import java.util.Map.Entry;

public class Example_01 {

	public static void main(String[] args) {
		
		  Hashtable<Integer,String> h=new Hashtable<Integer,String>();  
		  
		  h.put(100,"Amit");  
		  h.put(102,"Ravi");  
		  h.put(101,"Vijay");  
		  h.put(103,"Rahul");  
		 // h.put(102, "Vicky");
		  
		  System.out.println("Size of the Hashtable is : "+h.size());
		  
		  System.out.println(h);
		  
		  for(Entry<Integer, String> m:h.entrySet())
		  {  
		   System.out.println(m.getKey()+" "+m.getValue()); 
		  } 
		  
		  h.remove(101);
		  System.out.println(h);
		  
		  System.out.println(h.getOrDefault(101, "Not Found"));  
		  System.out.println(h.getOrDefault(109, "Not Found"));  
		     
		  h.putIfAbsent(104,"Gaurav");  
		  System.out.println("Updated Map: "+h);  
		  
		  h.putIfAbsent(101,"Vijay");  
		  System.out.println("Updated Map: "+h);  




	}

}
