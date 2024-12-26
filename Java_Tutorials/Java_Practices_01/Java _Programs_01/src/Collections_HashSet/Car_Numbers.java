package Collections_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Car_Numbers {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();
		
		for(int i=0;i<100;i++)
		{
			h.add(new String("H-"+i));
		}
		Iterator<String> itr = h.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
