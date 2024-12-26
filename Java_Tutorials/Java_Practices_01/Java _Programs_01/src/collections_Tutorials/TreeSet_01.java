package collections_Tutorials;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_01 {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(5);
		ts.add(52);
		ts.add(36);
		ts.add(12);
		ts.add(7);
		ts.add(24);
		ts.add(7);
		
		Iterator<Integer> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		Iterator itr = ts.descendingIterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		TreeSet<Integer> ts1 = (TreeSet<Integer>) ts.headSet(16);//Upto 16 how many values
		System.out.println(ts1);
		
		TreeSet<Integer> ts2 = (TreeSet<Integer>) ts.tailSet(16);//After 16 how many values
		System.out.println(ts2);
		
		TreeSet<Integer> ts3 = (TreeSet<Integer>) ts.subSet(4, 26);//Printing values in between 4 and 26
		System.out.println(ts3);
	}

}
