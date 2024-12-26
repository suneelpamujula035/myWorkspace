package collections_Tutorials;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayList_02 {

	public static void main(String[] args) {

		
       List<String> al = new ArrayList<>();
		
		al.add("suneel");
		al.add("Tiru");
		al.add("pavan");
		al.add("Naresh");
		al.add("suresh");
		al.add("Chaithanya");
		al.add("Greeshma");
		al.add(3,"Fahim");

    	    List<String> al1 = new ArrayList<>();
			
    	    al1.add("Aliya Bhatt");
			al1.add("Vasantha");
			al1.add("Mounika");
			al1.add("Pallavi");
			al1.add("Sandhya");
			al1.add("Mounika");
			al1.add(3,"Anushka Sharma");
			al1.add("Keerthi");
			al1.addAll(al);
			al1.set(1, "Saaho");
			//al1.sort(String.CASE_INSENSITIVE_ORDER);//Printing elements in Alphabetical order
			//al1.sort(Comparator.naturalOrder());//Printing First upper case letters and Last lower case letters
			//System.out.println(al1.subList(2, 7));//Printing values from index position 2 to 7

			//al1.addAll(1, al); //Adding list baased on index position
			//al1.clear();
			
			//Iterator<String> itr = al1.iterator();
			for(String s:al1)
			{
				System.out.println(s);
			}
			
			System.out.println(al1.equals(al));//Lists will be same order and same elements.
			System.out.println(al.isEmpty());//false
			System.out.println(al1.lastIndexOf("Greeshma"));//Finding the index position of the element
			System.out.println(al1.contains("Kajal"));
			
			//al1.remove(4);//Removing element based on index position
			//al1.remove("Vasantha");//Removing element based on name
			

	}

}
