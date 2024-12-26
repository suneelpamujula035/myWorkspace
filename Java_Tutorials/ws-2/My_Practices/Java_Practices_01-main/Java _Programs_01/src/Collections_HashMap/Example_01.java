package Collections_HashMap;

import java.util.HashMap;

public class Example_01 {

	public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>(); 

    // Add elements to the map 
    map.put("vishal", 10); 
    map.put("sachin", 30); 
    map.put("vaibhav", 20); 

    // Print size and content 
    System.out.println("Size of map is:- "
                       + map.size()); 
    System.out.println(map); 

    // Check if a key is present and if 
    // present, print value 
    if (map.containsKey("vishal")) { 
        Integer a = map.get("vishal"); 
        System.out.println("value for key"
                           + " \"vishal\" is:- "
                           + a); 

	}
    }
}
	


