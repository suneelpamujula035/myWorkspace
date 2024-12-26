package Collections_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Example_04 {

	private static final int Map = 0;
	private static final int String = 0;
	private static final HashMap<java.lang.String, Integer> Integer = null;

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		System.out.println(map);
		map.put("abc", 10);
		map.put("man", 44);
		map.put("xyz", 87);
		
	    System.out.println("Size of the map is :" +map.size());
	    System.out.println(map);
	    
	    if(map.containsKey("abc"))
	    {
	    	Integer a = map.get("abc");
	    	System.out.println("Value of \"abc\" is :  "  +  a);
	    }
	    map.clear();
	    System.out.println(map);
	    
	    
//	    public static void print(Map<String, Integer> map)
//	    {
//	    	if(map.isEmpty())
//	    	{
//	    		System.out.println("Map is empty");
//	    	}
//	    	else
//	    	{
//	    		System.out.println("map");
//	    	}
//	    }
	}

}
