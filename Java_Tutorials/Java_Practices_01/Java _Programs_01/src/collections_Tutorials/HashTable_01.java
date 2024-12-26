package collections_Tutorials;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTable_01 {

	public static void main(String[] args) {

		Hashtable<Integer, String> lhm = new Hashtable<Integer, String>();
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
		
		Set<Integer> s = lhm.keySet();
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			Integer obj = itr.next();
			//int str = obj;//If keys will be String then take String
			System.out.println(obj+"  "+lhm.get(obj));
		}
	}

}
