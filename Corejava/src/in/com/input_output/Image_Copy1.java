package in.com.input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image_Copy1 {

	public static void main(String[] args) throws IOException {
		FileInputStream input=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\File\\Picture.jpeg");
        FileOutputStream output=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Himanshu\\NewImage.jpeg");
        int value=input.read();
        while(value!=-1) {
        	output.write(value);
        	value=input.read();
        }
        System.out.println("File Copy Successfuuly");
        input.close();output.close();
        
	}

}
