package java_programs_07;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 2340; 
        int originalNumber = number;
        int reversedNumber = 0;
        int countDigits = 0;

        // Count the number of digits in the original number
        while (originalNumber != 0) {
            originalNumber /= 10;
            countDigits++;
        }

        // Reverse the number
        while (number != 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number /= 10; 
        }

        // Print the reversed number with leading zeros 
        System.out.print("Reversed Number: ");
        for (int i = 0; i < countDigits; i++) {
            System.out.print(reversedNumber / (int)Math.pow(10, countDigits - i - 1) % 10); 
        }
        System.out.println(); 
	}

}
