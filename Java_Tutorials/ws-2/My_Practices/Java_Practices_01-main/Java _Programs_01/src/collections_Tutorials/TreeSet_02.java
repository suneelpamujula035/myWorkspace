package collections_Tutorials;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_02 {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Mahitha");
		ts.add("Raamu");
		ts.add("Sreekanth");
		ts.add("Sanjay");
		ts.add("Abhishek");
		ts.add("Prasad");
		ts.add("Aliya");
		ts.add("Sanjay");

		Iterator<String> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
//                                 HashSet               LinkedHashSet               TreeSet
//Order                            unordered             order                       sort
//Duplicates                       No                    No                          No
//Synchronized                     No                    No                          No
//DataStructure                    HashTable             HashTable+DoublyLinkedList  BalancedTree
//Capacity                         16                    16                          No Capacity