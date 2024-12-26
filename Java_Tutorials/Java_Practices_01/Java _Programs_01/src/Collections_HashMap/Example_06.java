package Collections_HashMap;

import java.util.ArrayList;
import java.util.List;

public class Example_06 {

	public static void main(String[] args) {

		List l = new ArrayList<>();
		for(int i=0; i<1000; i++)
		{
			l.add("Demo : "+i);
		}
		l.forEach(x->System.out.println(x));
	}

}
