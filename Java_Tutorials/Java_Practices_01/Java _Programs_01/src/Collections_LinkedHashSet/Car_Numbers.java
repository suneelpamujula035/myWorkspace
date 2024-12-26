package Collections_LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Car_Numbers {

	public static void main(String[] args) {
		
        LinkedHashSet<String> h = new LinkedHashSet<String>();
		
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
