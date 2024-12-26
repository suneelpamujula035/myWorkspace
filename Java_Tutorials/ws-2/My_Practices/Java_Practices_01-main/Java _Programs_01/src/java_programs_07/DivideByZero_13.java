package java_programs_07;

public class DivideByZero_13 {

	public static void main(String[] args) {

		// What will be the output when you divide a number by zero?
		
		//System.out.println(9/0);//ArithmaticException
		System.out.println(9.0/0);//Infinity
		System.out.println(12.45f/0);//Infinity
		System.out.println(7/0.0);//Infinity
		System.out.println(67.9999d/0);//Infinity
		System.out.println(0.0/0);//NaN - Not A Number
		System.out.println(0.0/0.0);//NaN
		System.out.println(12.33/0.0);//Infinity
	}

}
