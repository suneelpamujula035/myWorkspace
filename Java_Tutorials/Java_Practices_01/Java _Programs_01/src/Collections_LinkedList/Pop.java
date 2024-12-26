package Collections_LinkedList;

import java.util.LinkedList;

public class Pop {

	public static void main(String[] args) {
		
		LinkedList<String> stack = new LinkedList<String>();
		
		stack.push("A");
		stack.push("B");
		
		String s = stack.pop();
		System.out.println(s);
		
		stack.push("C");
		System.out.println(stack);


	}

}
