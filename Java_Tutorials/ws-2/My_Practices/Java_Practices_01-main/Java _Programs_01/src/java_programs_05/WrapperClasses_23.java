package java_programs_05;

import java.util.ArrayList;

public class WrapperClasses_23 {

	public static void main(String[] args) {

		int i = 5;
		Integer ii = new Integer(i);//Boxing
		Integer jj = i;//AutoBoxing
		
		int j = jj.intValue();//UnBoxing
		int k = jj;//AutoUnBoxing
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(32);
		
		for(int data : list)
		{
			System.out.println(data);
		}
				
	}

}
//Wrapper classes are used to wrap primitive contents into an object
//Primitive data types are not objects
//Collection framework or data-structure works only with objects
//Generics don't allow using primitive types as the type parameters
//Multithreading needs objects to support Synchonization
