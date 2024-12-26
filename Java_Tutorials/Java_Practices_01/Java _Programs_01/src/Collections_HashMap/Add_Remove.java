package Collections_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Add_Remove {

	public static void main(String[] args) {

		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		//How to remove elements from HashMap
		System.out.println("Elements in the HashMap before removing : "+map);
		//map.remove(3);
		System.out.println("Elements in the HashMap after removing : "+map);
		
		//How to get values from HashMap
		Collection<String> values = map.values();
		for(String s:values)
		{
			System.out.println(s);
		}
		
		//How to search for a key in HashMap
		if(map.containsKey(2))
		{
			System.out.println("Hurrey 2 is there in map");
		}
		else
		{
			System.out.println("2 is not present in map");
		}
		
		//How to search for a value in HashMap
		if(map.containsValue("B"))
		{
			System.out.println("Hurrey B is there in map");
		}
		else
		{
			System.out.println("B is not present in map");
		}
		
		//How to create HashMap and how to add elements to HashMap
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		//How to find the size the HashMap
		System.out.println("Size of the HashMap is : "+map.size());
		
		//How to remove all elements from HashMap
		//map.clear();
		//System.out.println("After clearing map : "+map);
		
		
		//How to check map is empty or not
		if(map.isEmpty())
		{
			System.out.println("Map is empty");
		}
		else
		{
			System.out.println("Map is filled with elements");
		}

		

	}

}
