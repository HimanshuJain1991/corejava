package co.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParseExample {

	public static void main(String[] args) throws ParseException {
		Date today=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String strDate=sdf.format(today);
		System.out.println(strDate);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("MMMM dd,yyyy");
		System.out.println( sdf1.format(today));
		
		Date pDate=sdf.parse("15/06/2024");
		System.out.println(pDate);

	}

}
