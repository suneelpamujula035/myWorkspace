package collections_Tutorials;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_01 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(5);
		lhs.add(52);
		lhs.add(36);
		lhs.add(12);
		lhs.add(7);
		lhs.add(24);
		lhs.add(7);
		
		Iterator<Integer> itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
//HashSet       ----->  HashTable
//LinkedHashSet ----->  HashTables + doublyLinkedList


//HashSet duplicate values no
//        insertion order no
//LinkedHashSet duplicate values no
//        insertion order yes
//TreeSet duplicate values no
//        sorting(ascending order)