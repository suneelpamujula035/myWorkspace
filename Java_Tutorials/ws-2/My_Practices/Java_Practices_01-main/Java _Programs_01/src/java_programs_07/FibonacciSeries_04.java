package java_programs_07;

import java.util.Scanner;

public class FibonacciSeries_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Upto how many values do you want fibonacci series");
		int givenNumber = sc.nextInt();
		int i1 = 0;
		int i2 = 1;
		int sum = 0;

		for (int i = 1; i <= givenNumber; i++) {
			sum = i1 + i2;
			System.out.print(i1 + " ");
			i1 = i2;
			i2 = sum;

		}
	}

}
