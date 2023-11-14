import java.util.Calendar;
import java.util.Date;

public class Calendar_Example {

	public static void main(String[] args) {
		//Date today=new Date();
		Calendar cal=Calendar.getInstance();
	//	cal.setTime(today);
		System.out.println(cal.getTime());
		cal.add(Calendar.DATE, 25);
		System.out.println(cal.getTime());

	}

}
