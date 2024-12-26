package collections_Tutorials;

import java.util.Vector;

public class Vector_01 {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		//Vector<String> v = new Vector<String>(30);//We can set default capacity of Vector

		System.out.println(v.capacity());//Default capacity of Vector is 10
		
		v.add("Suresh");
		v.add("Mahesh");
		v.add("Ali");
		v.add("Sharukh");
		v.add("Hafeez");
		v.add("Charan");
		v.add("Vinod");
		v.add("Sreenu");
		v.add("Kiran");
		v.add("Sharukh");
		v.add("Gireesh");
		v.add("Pavan");
		System.out.println(v.capacity());//Vector capacity will be doubled when you add elements
		System.out.println(v.size());
	}
}
//not synchronized no thread safe(ArrayList) - capacity increases 50%
//synchronized only access one thread at a time(Vector) - capacity increases 100%
