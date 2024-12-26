package Collections_ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex_01 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Suneel","Mahesh","Santhosh","Balu");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
	}

}
