package Collections_Vector;

import java.util.Vector;

public class Example_01 {

	public static void main(String[] args) {

        Vector<String> vec = new Vector<String>();  
        
        //Adding elements using add() method of List  
        vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant");  
        
        //Adding elements using addElement() method of Vector  
        vec.addElement("Rat");  
        vec.addElement("Cat");  
        vec.addElement("Deer");  
          
        System.out.println("Elements are: "+vec);  

	}

}
