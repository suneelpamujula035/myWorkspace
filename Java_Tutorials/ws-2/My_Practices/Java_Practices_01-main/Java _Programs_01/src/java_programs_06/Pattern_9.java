package java_programs_06;

public class Pattern_9 {

	int i = 1, j = 1;

	public void print(int rows) {
		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void print1(int rows) {
		for (i = rows - 1; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern_9 p = new Pattern_9();
		p.print(8);
		p.print1(8);

	}

}
