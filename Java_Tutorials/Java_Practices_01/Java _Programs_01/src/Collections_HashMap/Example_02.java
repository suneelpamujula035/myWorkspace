package Collections_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Example_02 {

	public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();
        
        map.put("101", "White");
        map.put("102", "Black");
        map.put("103", "Blue");
        map.put("104", "Yellow");
        map.put("105", "Blue");
        map.put("102", "Gray");
        System.out.println("Size of HashMap is : "+map.size());
        System.out.println(map);
        
       // String v = map.get("102");
       // System.out.println(v);

        System.out.println(map.get("101"));
	
	for(Map.Entry m:map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}


	}
}
