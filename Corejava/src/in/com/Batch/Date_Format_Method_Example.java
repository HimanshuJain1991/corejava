package in.com.Batch;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Date_Format_Method_Example {

	public static void main(String[] args) {
         Date date= new Date();
         System.out.println(date);
       SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
       String str=sdf.format(date);
       System.out.println(str);
       
       
       
		

	}

}
