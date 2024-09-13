package co.rays.exercise;

import java.util.Random;

public class ThirdQuestion {

	public static void main(String[] args) {
		Random random =new Random();
		for(int i=1;i<=5;i++) {
			int numbers=random.nextInt(100)+1;
			System.out.println(numbers);
		}

	}

}
