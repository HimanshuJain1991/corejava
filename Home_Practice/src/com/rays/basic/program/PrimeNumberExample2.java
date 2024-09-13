package com.rays.basic.program;

public class PrimeNumberExample2 {

	public static void main(String[] args) {
		int number = 7, count = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				count++;
				// System.out.println(i);
			}

		}
		if (count == 0) {
			System.out.println("number is prime");
		} else {
			System.out.println("not prime");
		}

	}

}
