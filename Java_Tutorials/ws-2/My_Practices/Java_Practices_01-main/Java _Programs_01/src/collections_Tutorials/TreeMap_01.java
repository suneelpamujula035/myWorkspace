package collections_Tutorials;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TreeMap_01 {

	public static void main(String[] args) {

		TreeMap_01 tm = new TreeMap_01();
		tm.put(1, "Suneel");//Follows sorting(Order wise)
		tm.put(5, "Yash");
		tm.put(6, "Karthik");
		tm.put(2, "Guru");
		tm.put(3, "Sandy");
		tm.put(4, "Farukh");
		tm.put(4, "Anil");//Keys can't be duplicates and values will be duplicate
		//lhm.remove(3);
		
		//System.out.println(tm);
		//System.out.println(tm.get(2));
		
		Set s = tm.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			String str = (String) obj;//If keys will be String then take String
			System.out.println(str+"  "+tm.get(str));
		}
	}
	//                        Capacity
	//HashMap           ----> 16             HashTable
	//LinkedHashMap     ----> 16             HashTable + Doubly LinkedList
	//TreeMap           ----> ----           RedBlackTree
	//HashTable         ----> 11             HashTable

	private void put(int i, String string) {
		// TODO Auto-generated method stub
		
	}

	private Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	private String get(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}
