package Collections_ArrayList;

import java.util.ArrayList;

public class Get_And_Set_Methods {              // get and set ArrayList

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		//Accessing the element
		System.out.println("Returning the element: "+list.get(1));
		
		//changing the element
		list.set(1, "Dates");
		list.set(3, "Kaaju");
		list.add("Stroberry");
		
		System.out.println("Number of ArrayList : "+list.size());
		
		//For getting List
		for(String fruit:list)
		{
			System.out.println(fruit);
		}

	}

}
