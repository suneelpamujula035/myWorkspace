package wrapperClasses;

public class WrapperClass_01 {

	public static void main(String[] args) {

		int x = 20;//Converting of datatype into object
		Integer y = x;//Auto boxing
		Integer y1 = Integer.valueOf(x);
		System.out.println(y);
		System.out.println(y1);
		
		Integer i = new Integer(40);
		int j = i;
		System.out.println(i);
		System.out.println(j);
		
		// 1. To wrap primitive into object form
		// 2. To define several utility methods for primitives
	}

}
