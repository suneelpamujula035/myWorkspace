package com.streams;

import java.util.stream.IntStream;

public class SimplePrimeCheck {

	public static void main(String[] args) {
        int number = 7;
        boolean isPrime = isPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.range(2, number).noneMatch(divisor -> number%divisor == 0);
    }
}
