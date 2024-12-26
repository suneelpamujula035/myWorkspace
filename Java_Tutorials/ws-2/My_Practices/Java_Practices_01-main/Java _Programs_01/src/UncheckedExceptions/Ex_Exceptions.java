package UncheckedExceptions;

public class Ex_Exceptions {

	public static void ArithmeticException() {
		try {
			int a = 1;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		}

		catch (Exception e) {
			System.out.println("We can't divide by zero  " + e);
		}
	}

	public static void main(String[] args) {
		ArithmeticException();
	}

}
