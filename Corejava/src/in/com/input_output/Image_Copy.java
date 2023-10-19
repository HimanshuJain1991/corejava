package in.com.input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image_Copy {

	public static void main(String[] args)throws IOException {
      FileInputStream	 input=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Himanshu\\Riyansh.jpg");	
      FileOutputStream   output=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Himanshu\\CopyImage1.jpg");
      
      int ch=input.read();
      while(ch!=-1) {
    	  output.write(ch);
    	  ch=input.read();
    	 
      } 
      input.close();output.close();
      System.out.println("Image Copy Successfully!!!");
      
	}

}
