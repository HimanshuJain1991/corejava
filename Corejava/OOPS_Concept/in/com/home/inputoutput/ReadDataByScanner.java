package in.com.home.inputoutput;

import java.io.FileReader;
import java.util.Scanner;

public class ReadDataByScanner {

	public static void main(String[] args) {
		try {
			FileReader reader=new FileReader("C:\\Users\\ADMIN\\Desktop\\File\\test\\Data.txt");
            Scanner s=new Scanner(reader);	
            while(s.hasNext()) {
            	System.out.println(s.nextLine());
            }
            reader.close();s.close();
		} catch (Exception e) {
			
			}
	

	}

}
