package collections_Tutorials;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_01 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("Suneel");
		hs.add("Gireesh");
		hs.add("Mahesh");
		hs.add("Raana");
		hs.add("Tiru");
		hs.add("Sampath");
		hs.add("Suneel");
		hs.add("Yash");
		
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	//capacity 16, double, 0.75 or 75%
}
//                                  List-----------------------Set
//insertion order                   Yes                        No(Random)
//duplicate values                  Yes                        No
//index                             Yes                        No