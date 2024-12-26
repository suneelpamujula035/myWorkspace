package collections_Tutorials;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_01 {

	public static void main(String[] args) {


		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Suneel");
		hm.put(2, "Guru");
		hm.put(3, "Sandy");
		hm.put(4, "Farukh");
		hm.put(5, "Yash");
		hm.put(6, "Karthik");
		hm.put(4, "Anil");//Keys can't be duplicates and values will be duplicate
		//hm.remove(3);
		
		//System.out.println(hm);
		//System.out.println(hm.get(2));
		
		Set<Integer> s = hm.keySet();
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			int str = (int) obj;//If keys will be String then take String
			System.out.println(str+"  "+hm.get(str));
		}
	}

}
