package co.rays.exercise;

public class SixthQuestionFibonacciSeries {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1;
		System.out.println(num1 + " \n" + num2);
		for (int i = 1; i <= 10; i++) {
			int c = num1 + num2;
			num1 = num2;
			num2 = c;
			System.out.println(c);
		}

	}

}
