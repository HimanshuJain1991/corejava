package in.com.batch;

import java.util.Calendar;
import java.util.Date;

public class Calendar_Example {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, 5);
		
		System.out.println(cal.getTime());
		
		Calendar e=Calendar.getInstance();
		e.add(Calendar.DATE,7);
		System.out.println(e.getTime());

	}

}
