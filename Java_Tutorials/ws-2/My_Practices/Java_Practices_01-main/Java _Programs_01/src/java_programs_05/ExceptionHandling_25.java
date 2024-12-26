package java_programs_05;

public class ExceptionHandling_25 {

	public static void main(String[] args) {

		try {
			System.out.println("Im from try block");
			int a = 15 / 0;
			System.out.println("result " + a);
			System.out.println("Exception handled");
		} catch (Exception e) {
			System.out.println("Im from catch block");
			e.printStackTrace();
		} finally {
			System.out.println("Im from finally block");
		}

		System.out.println("Hiiii friends");
		System.out.println("Welcome to India");
	}

}
