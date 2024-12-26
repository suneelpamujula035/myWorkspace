package collections_Tutorials;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_04 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(58);
		al.add(104);
		al.add(230);
		al.add(584);
		al.add(147);
		al.add(56);
		al.add(45);
		
		System.out.println(al);
		Collections.sort(al);
		//Collections.reverse(al);
		//Collections.swap(al,1,4);
		System.out.println(al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));

	}

}
