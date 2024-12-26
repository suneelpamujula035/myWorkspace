package Collections_LinkedList;

import java.util.LinkedList;

public class Array_To_LinkedList {

	public static void main(String[] args) {

		String[] cources = {"Jav","PHP","Hadoop","DevOps","Python"};
		LinkedList<String> courseslist = new LinkedList<String>();
		
		for(String s : cources)
		{
			courseslist.add(s);
		}
		System.out.println("The array of popular cource is : "+courseslist);
	}

}
