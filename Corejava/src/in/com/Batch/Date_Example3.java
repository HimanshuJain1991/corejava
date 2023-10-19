package in.com.batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Example3 {
 
	public static void main(String[] args) throws ParseException {
	 Date d1=new Date();
	 System.out.println(d1);
	 SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	String str=sdf.format(d1);
    System.out.println(str);
     System.out.println( sdf.parse(str));
  // System.out.println(date);
     

	}

}
