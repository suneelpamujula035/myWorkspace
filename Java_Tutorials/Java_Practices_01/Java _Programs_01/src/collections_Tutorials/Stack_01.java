package collections_Tutorials;

import java.util.Stack;

public class Stack_01 {

	public static void main(String[] args) {

		Stack s = new Stack();//Stack maintains LIFO order
		s.push(5);//adding elements
		s.push(11);
		s.push(15);
		s.push(19);
		s.push(26);
		
		System.out.println(s);
		//s.pop();//Removing first elements
		//System.out.println(s);
		System.out.println(s.peek());//Reading top value 26
		System.out.println(s.empty());
		System.out.println(s.search(19));//Counting from bottom 2

		
	}

}
//Vector and Stack are thread safe
