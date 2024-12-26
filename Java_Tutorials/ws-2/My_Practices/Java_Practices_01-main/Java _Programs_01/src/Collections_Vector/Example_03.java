package Collections_Vector;

import java.util.Vector;

public class Example_03 {

	public static void main(String[] args) {

        Vector<Integer> in = new Vector<Integer>(); 
        
        in.add(100);  
        in.add(200);  
        in.add(300);  
        in.add(750);  
        in.add(400);  
        in.add(540);  
        in.add(600);  
        in.add(700);  
        
        System.out.println("Values in vector: " +in);
        System.out.println("Remove first occourence of element 200: "+in.remove((Integer)200));  
        System.out.println("Values in vector: " +in);  
        
        System.out.println("Remove element at index 4: " +in.remove(4));  
        System.out.println("New Value list in vector: " +in);  
        
        //Remove an element  
        in.removeElementAt(5);   
        
        System.out.println("Vector element after removal: " +in);  
        
        System.out.println("Hash code of this vector = "+in.hashCode()); 
        
        System.out.println("Element at index 1 is = "+in.get(1));  

	}

}
