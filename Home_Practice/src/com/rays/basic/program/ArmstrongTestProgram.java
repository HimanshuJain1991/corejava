package com.rays.basic.program;

public class ArmstrongTestProgram {

	public static void main(String[] args) {
		int num = 153, sum = 0, rem = 0;
		int temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		// System.out.println("total is:"+sum);
		if (temp == sum) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not Armstrong Number");
		}

	}

}
