package com.demo;

public class MultipleCatchExample {

	public static void main(String[] args) {

		try {
            // Code that may throw different types of exceptions
            int[] numbers = {1, 2, 3};
            int index = 4; // trying to access an index out of bounds

            int result = numbers[index]; // This line will throw an ArrayIndexOutOfBoundsException

            // This line will throw an ArithmeticException
            int divisionResult = 10 / 0;

            System.out.println("Result: " + result);
            System.out.println("Division Result: " + divisionResult);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            // Generic catch block to catch any other exceptions
            System.out.println("Caught Exception: " + e.getMessage());
        }
	}

}
