package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		//List<Integer> asList = Arrays.asList(23,12,89,43,45,76,38,25,84);
		//asList.stream().forEach(System.out::println);
		
		ArrayList<Integer> l = new ArrayList<>();
		//Integer a[] = {10,20,30};
		Collections.addAll(l, 23,12,89,43,45,76,38,25,84);
//		Iterator<Integer> iterator = l.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
		//l.forEach(x->System.out.println(x));
		Collections.sort(l);
		Collections.reverse(l);
		l.forEach(x->System.out.println(x));
		//l.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
