package collections_Tutorials;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap_01 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1, "Suneel");
		lhm.put(5, "Yash");
		lhm.put(6, "Karthik");//Follows insertion order
		lhm.put(2, "Guru");
		lhm.put(3, "Sandy");
		lhm.put(4, "Farukh");
		lhm.put(4, "Anil");//Keys can't be duplicates and values will be duplicate
		//lhm.remove(3);
		
		//System.out.println(lhm);
		//System.out.println(lhm.get(2));
		
		Set s = lhm.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			int str = (int) obj;//If keys will be String then take String
			System.out.println(str+"  "+lhm.get(str));
		}
	}

}
