package co.rays.date.arithmetic;

import java.time.LocalDate;

public class LocalDateExample {
public static void main(String[] args) {
	LocalDate date=LocalDate.now();
	System.out.println(date);
	LocalDate yesterday=date.minusDays(1);
	System.out.println(yesterday);
	System.out.println(yesterday.plusDays(7));
}
}
