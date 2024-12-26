package Collections_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Add {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();     //non-synchronized
		                                                 //deletion of duplicate elements
		set.add("Suneel");
		set.add("Pawan");
		set.add("Ravi");
		set.add("Kalyan");
		set.add("Surya");
		set.add("Kalyan");
		set.add("Pawan");
		set.add("Tiru");
		set.add("Karthik");
		set.add("Tiru");
		
		System.out.println(set.size());
		System.out.println("New students list is :  "+set);
		
		Iterator<String> i = set.iterator();                     //Iterator used for order of elements
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		HashSet<String> set1 = new HashSet<String>();     
		set1.add("Banana");
		set1.add("Mango");
		set.addAll(set1);
		
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();                     //Iterator used for order of elements
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(set.size());

		

	}

}
