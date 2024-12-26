package Collections_ArrayList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayList_Using_Serializable {

	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();

		
		System.out.println(l1 instanceof Serializable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(l1 instanceof RandomAccess);
		System.out.println(l2 instanceof RandomAccess);

	}

}
