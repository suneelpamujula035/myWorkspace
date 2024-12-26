package collections_Tutorials;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_01 {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		
		al.add("suneel");
		al.add("Tiru");
		al.add("pavan");
		al.add("Naresh");
		al.add("suresh");
		al.add("Chaithanya");
		al.add("Greeshma");
		al.add(3,"Fahim");
		
		System.out.println(al);
		System.out.println("---------------------------------------------------");
		System.out.println("Using for-each loop");
		for(String x:al)
		{
			System.out.println(x);
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Using for-loop");
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Using iterator----------forward order");
		
		ListIterator<String> itr = al.listIterator();
		//Iterator itr1 = al.iterator();
		
		System.out.println("In forward direction");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Using iterator----------reverse order");

		System.out.println("In reverse direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		System.out.println("---------------------------------------------------");
        System.out.println("By using Lambda Expressions");

        al.forEach( b-> System.out.println(b) );
	}

}
