package in.com.batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Home {

	public static void main(String[] args) throws ParseException {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String str=sdf.format(date);
		System.out.println(str);
		Date d=sdf.parse(str);
		System.out.println(d);
		Calendar cal=Calendar.getInstance();
		cal.add(cal.DATE, 5);
		Date d2=cal.getTime();
		System.out.println(d2);
		System.out.println(cal.getCalendarType());
		//System.out.println(cal.getWeekYear());
		  
		
         
	}

}
