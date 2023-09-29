package in.com.Batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Parse_Example1 {

	public static void main(String[] args) throws ParseException {
			String str="18/09/2023";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	Date date=	sdf.parse(str);
		//System.out.println(date);

	}

}
