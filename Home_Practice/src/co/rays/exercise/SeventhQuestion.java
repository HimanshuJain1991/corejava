package co.rays.exercise;

public class SeventhQuestion {

	public static void main(String[] args) {
		int count = 0,sum=0;
		for (int i = 100; i <= 200; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				count++;
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
