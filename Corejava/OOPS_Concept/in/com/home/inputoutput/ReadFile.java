package in.com.home.inputoutput;

import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args)  {
		try {
			FileReader reader=new FileReader("C:\\Users\\ADMIN\\Desktop\\File\\test\\Data.txt");
	         int ch=reader.read();
			while(ch!=-1) {
				System.out.print((char)ch);
				ch=reader.read();
			}
			reader.close(); 
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
