package java_programs_05;

public class WrapperClasses_21 {

	public static void main(String[] args) {

		Boolean b = new Boolean("true");
		Boolean b1 = new Boolean(true);
		System.out.println(b.equals(b1));
		
		Boolean b2 = new Boolean("True");
		Boolean b3 = new Boolean("tRue");
		System.out.println(b2.equals(b3));
		
		Boolean b4 = new Boolean("hey");
		Boolean b5 = new Boolean("bye");
		System.out.println(b4.equals(b5));

		Boolean b6 = new Boolean("hello");
		Boolean b7 = new Boolean(false);
		System.out.println(b6.equals(b7));
		
		Boolean b8 = new Boolean(false);
		Boolean b9 = new Boolean(true);
		System.out.println(b8.equals(b9));
	}

}
