package in.com.Batch;

import java.util.Calendar;
import java.util.Date;

public class Calendar_Example3 {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, -10);
		Date d1=cal.getTime();
		System.out.println(d1);

	}

}
