package java_programs_07;

public class WrapperClasses {

	public static void main(String[] args) {

		Boolean b1 = new Boolean("true");//true
		Boolean b2 = new Boolean(true);//true
		System.out.println(b1.equals(b2));//true
		
		Boolean b3 = new Boolean("True");//true
		Boolean b4 = new Boolean("tRue");//true
		System.out.println(b3.equals(b4));//true
		
		Boolean b5 = new Boolean("hai");//false
		Boolean b6 = new Boolean("bye");//false
		System.out.println(b5.equals(b6));//true
		
		Boolean b7 = new Boolean("hello");//false
		Boolean b8 = new Boolean(false);//false
		System.out.println(b1.equals(b2));//true
		
	}

}
