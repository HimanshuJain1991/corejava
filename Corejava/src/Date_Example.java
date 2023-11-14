import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Example {

	public static void main(String[] args) throws ParseException {
		Date today=new Date();
		System.out.println(today);
		SimpleDateFormat format1 =new SimpleDateFormat("MM/dd/yy");
		String strDate=format1.format(today);
		System.out.println(strDate);
		SimpleDateFormat format2=new SimpleDateFormat("MM dd,YYYY");
		String strDate2=format2.format(today);
		System.out.println(strDate2);
		Date d1=format1.parse("11/11/2023");
		System.out.println(d1);
		
		
		

	}

}
