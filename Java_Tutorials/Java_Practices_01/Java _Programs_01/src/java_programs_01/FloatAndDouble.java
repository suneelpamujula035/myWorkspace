package java_programs_01;

public class FloatAndDouble {

	public static void main(String[] args) {

		double d = 10.111111111;//Double stores maximum 14 digits after decimal point
		float f = 10.111111111f;//Float stores maximum 6 digits after decimal point
		double d1 = 9.11111111111111111111111111111111;
		long l = 9160980881L;//We should store phone numbers in long data type
		System.out.println(d);
		System.out.println(f);
		System.out.println(d1);
		System.out.println(l);
		
		int x = 15;
		double y = x;
		System.out.println(y);
	}

}
