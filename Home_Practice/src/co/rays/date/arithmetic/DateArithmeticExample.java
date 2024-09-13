package co.rays.date.arithmetic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateArithmeticExample {

	public static void main(String[] args) {
		Date today=new Date();
		Calendar cal=Calendar.getInstance();
		cal.setTime(today);
		int dayOfYear=cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(dayOfYear);
		cal.add(Calendar.DATE, -1);
		Date yesterday=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("yesterday date=  "+sdf.format(yesterday));
		cal.add(Calendar.DATE, 30);
		Date after=cal.getTime();
		System.out.println(sdf.format(after));

	}

}
