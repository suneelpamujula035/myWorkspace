package Collections_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Example_03 {

	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestNG");
		hm.put(4, "Cucumber");
		
		System.out.println(hm.size());
		System.out.println(hm);
		
		for(Map.Entry t:hm.entrySet())
		{
			System.out.println(t.getKey()+"   "+t.getValue());
		}
		hm.remove(3);
		System.out.println(hm);

	}

}
