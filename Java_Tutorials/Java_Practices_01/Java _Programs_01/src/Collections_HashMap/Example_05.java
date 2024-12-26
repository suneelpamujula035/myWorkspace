package Collections_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Example_05 {

	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		hm.put(5, "Five");
		
		System.out.println("Size of the HashMap is:  "+hm.size());
		System.out.println(hm);
		
		for(Map.Entry<Integer, String> m : hm.entrySet())
		{
			int k = m.getKey();
			String s = m.getValue();
			System.out.println(k+"  "+s);
		}
		System.out.println(hm.get(4));
		System.out.println(hm.containsValue("Three"));
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsKey(9));
		
		System.out.println(hm.replace(2, "Hiiii"));
		System.out.println(hm);
		
		System.out.println(hm.keySet());


	}

}
