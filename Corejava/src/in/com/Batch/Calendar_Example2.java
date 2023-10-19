package in.com.batch;

import java.util.Calendar;
import java.util.Date;

public class Calendar_Example2 {


	public static void main(String[] args) {
       Calendar c1=Calendar.getInstance();
       Calendar c2=Calendar.getInstance();
       Date date=new Date();
       c2.setTime(date);
       System.out.println("default time  "+c1.getTime());
       System.out.println("set time  "+c2.getTime());
       if(c1.equals(c2)) {
    	   System.out.println("same");
       }
       else {
		System.out.println("not same");
	}
       
	  
	  

	}

}
