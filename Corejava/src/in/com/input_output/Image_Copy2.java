package in.com.input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image_Copy2 {

	public static void main(String[] args) throws IOException {
		FileInputStream input=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\File\\Riyansh.jpg");
	    FileOutputStream output=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Himanshu\\Destination.jpg");
	    int ch=input.read();
	    while(ch!=-1) {
	    	output.write(ch);
	    	ch=input.read();
	    	
	    }
	    System.out.println("Image Copy Completed");
	    input.close();
	    output.close();

	}

}
