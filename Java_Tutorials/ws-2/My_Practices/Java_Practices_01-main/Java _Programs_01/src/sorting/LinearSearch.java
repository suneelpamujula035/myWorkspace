package sorting;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		int a[] = { 90, 120, 65, 89, 10, 20, 30, 40, 50, 60, 61 };

		int keyPosition = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int key = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				keyPosition = i;
				break;
			} else {
				keyPosition = -1;
			}
		}
		System.out.println("key position : " + keyPosition);
	}

}
