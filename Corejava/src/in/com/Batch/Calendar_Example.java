package in.com.Batch;

import java.util.Calendar;
import java.util.Date;

public class Calendar_Example {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, 5);
		
		System.out.println(cal.getTime());
		
		

	}

}
