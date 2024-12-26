package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Set {

	public static void main(String[] args) {

		List<String> s = new ArrayList<String>();
		s.add("suneel");
		s.add("naresh");
		s.add("lokesh");
		s.add("suresh");
		s.add("ramesh");
		System.out.println(s);
		Collections.sort(s);
		System.out.println(s);
		Collections.reverse(s);
		System.out.println(s);
	}

}
