package assignments;

import java.util.Scanner;

public class ExamApp {

	public static void main(String[] args) {

		int englishCount = 0, mathCount = 0, gkCount = 0;
		String option;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.English  2.Maths  3.GK");
			System.out.println("Please enter the number to which exam you have to complete");
			int number = sc.nextInt();

			switch (number) {
			case 1: {
				System.out.println("Welcome to Engilsh Exam");
				if (number == 1) {
					englishCount++;
				}
				break;
			}
			case 2: {
				System.out.println("Welcome to Maths Exam");
				if (number == 2) {
					mathCount++;
				}
				break;
			}
			case 3: {
				System.out.println("Welcome to GK Exam");
				if (number == 3) {
					gkCount++;
				}
				break;
			}
			default: {
				System.out.println("Wrong option");
				break;
			}
			}
			System.out.println("Do you want to continue next exam");
			option = sc.next();
			if (option.equalsIgnoreCase("NO")) {
				if (englishCount == 0 || mathCount == 0 || gkCount == 0) {
					System.out.println("You must complete the all exams");
				} else {
					System.out.println("Your exams completed!.... If you want to write again your exams you can..");
				}

			}
		} while (option.equalsIgnoreCase("NO") == false);

	}

}
