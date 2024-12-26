package java_programs_05;

public class WrapperClasses_24 {

	public static void main(String[] args) {

		//Boxing process using constructors
		Integer obj1 = new Integer(123);
		Integer obj2 = new Integer("124");
		
		//Boxing process using valueOf method
		Integer obj3 = Integer.valueOf(125);
		Integer obj4 = Integer.valueOf(126);
		
		System.out.println("-------------After Boxing process-------------");
		System.out.println("obj1 = "+obj1);
		System.out.println("obj2 = "+obj2);
		System.out.println("obj3 = "+obj3);
		System.out.println("obj4 = "+obj4);
		
		//UnBoxing process
		int a = obj1.intValue();
		String s1 = obj2.toString();
		int b = obj3.intValue();
		String s2 = obj4.toString();
		
		System.out.println("-------------After UnBoxing process-------------");
		System.out.println("a = "+a);
		System.out.println("s1 = "+s1);
		System.out.println("b = "+b);
		System.out.println("s2 = "+s2);




	}

}
