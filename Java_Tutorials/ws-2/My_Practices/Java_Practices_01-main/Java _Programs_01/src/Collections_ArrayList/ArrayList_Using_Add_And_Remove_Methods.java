package Collections_ArrayList;

import java.util.ArrayList;

public class ArrayList_Using_Add_And_Remove_Methods {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		System.out.println("Number of elements :" +al.size());  // we are printing zero elements
		
		al.add("Welcome");
		al.add(10);
		al.add(15.452);
		al.add('M');
		al.add("Hiiii Friends");
		al.add(596.78);
		
		
		System.out.println("Number of elements in array list after adding are :  "+al.size());
		System.out.println(al);
		System.out.println("This is the ArrayList");
		
		//Inserting elements into ArrayList
		al.add(3,"Pawan");      // 2 is describes after number of elements not position
		al.add(5,"Suneel");     // 5 is describes after number of elements not position
		System.out.println("Number of elements in arry list after inserting are:  "+al.size());
		System.out.println("Elements in ArryList :  "+al);
		
		al.add(4,"Manufacturing Technology");  // 4 is describes after number of elements not position
		al.add("Engineering Mechanics");      
		al.add(6,"Manegirial Economics and Financial Analysis [MEFA]");  // 6 is describes after number of elements not position
		System.out.println("Number of elements after inserting in array list: "+al.size());
		System.out.println("ArrayList elements are : " + al);
		
		//Removing elements from array list
		al.remove("Pawan"); //directly specify the value
		System.out.println(al.size());
		System.out.println("Elements in array : "+al);
		
		al.remove(5);  //5 is describes after number of elements not exactly position
		System.out.println(al.size());
		System.out.println(al);
		
		
		

	}

}
