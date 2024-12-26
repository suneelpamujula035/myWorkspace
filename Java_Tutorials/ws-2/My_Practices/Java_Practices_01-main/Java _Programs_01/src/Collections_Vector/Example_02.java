package Collections_Vector;

import java.util.Vector;

public class Example_02 {

	public static void main(String[] args) {

        Vector<String> vec = new Vector<String>(13); 
        
        vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant");  
        
        System.out.println("Size is: "+vec.size()); 
        
        System.out.println("Default capacity is: "+vec.capacity());  
        
        System.out.println("Vector element is: "+vec);  
        
        vec.addElement("Rat");  
        vec.addElement("Cat");  
        vec.addElement("Deer");  
        
        System.out.println("Size after addition: "+vec.size());
        
        System.out.println("Capacity after addition is: "+vec.capacity()); 
        
        System.out.println("Elements are: "+vec);  
        
        //Checking if Tiger is present or not in this vector         
          if(vec.contains("Lion"))  
          {  
             System.out.println("Lion is present at the index " +vec.indexOf("Lion"));  
          }  
          else  
          {  
             System.out.println("Lion is not present in the list.");  
          }  
          
          
        System.out.println("The first animal of the vector is = "+vec.firstElement());   
        System.out.println("The last animal of the vector is = "+vec.lastElement());   

	}

}
