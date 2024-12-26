package lambda_Expressions;

import java.util.ArrayList;


public class Lambda_Expressions_05 {

	public static void main(String[] args) {

		java.util.List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("green");
		list.add("Black");
		list.add("Blue");
		list.add("White");
		list.add("Orange");
		
		list.forEach(
				(n)->System.out.println(n)
				);
	}

}
