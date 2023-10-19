package in.com.input_output;

import java.io.FileReader;
import java.io.IOException;


public class TextReader {

	public static void main(String[] args) throws IOException  {
//		 FileReader reader=new FileReader("C:\\Users\\ADMIN\\Desktop\\Himanshu//File.txt");
//            int ch=reader.read();
//            while(ch!=-1) {
//            	System.out.print((char)ch);
//            	ch=reader.read();
//            }
//            reader.close();
//		FileReader reader=new FileReader("C:\\\\Users\\\\ADMIN\\\\Desktop\\\\Himanshu//File.txt");
//	     int ch= reader.read();
//	     
//	     while(ch>-1) {
//	    	 System.out.print((char)ch);
//	    	 ch=reader.read();
//	     }
//	     reader.close();
//
//	}
             FileReader file= new FileReader("C:\\Users\\ADMIN\\Desktop\\Himanshu\\File.txt");
             int ch=file.read();
             while(ch!=-1) {
            	 System.out.print((char)ch);
            	 ch=file.read();
             }
             file.close();
	}
	
	}
