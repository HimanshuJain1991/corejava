package in.com.input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Image_Copy_File {

	public static void main(String[] args) {
		try {
			String source="C:\\Users\\ADMIN\\Desktop\\File\\Picture.jpeg";
		    String destination="C:\\Users\\ADMIN\\Desktop\\File\\test\\Photo1.jpg";
		     FileInputStream file=new FileInputStream(source);
		     FileOutputStream out=new FileOutputStream(destination);
		     int ch=file.read();
		     while(ch!=-1) {
		    	 out.write(ch);
		    	 ch=file.read();
		     }
		     out.close();file.close();
		     System.out.println(" copy completed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    
	}

}
