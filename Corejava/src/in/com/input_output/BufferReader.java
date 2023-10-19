package in.com.input_output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		FileReader file =new FileReader("C:\\Users\\ADMIN\\Desktop\\Himanshu\\File.txt");
         BufferedReader buffer=new BufferedReader(file);
         String line=buffer.readLine();
         while(line !=null) {
        	 System.out.println(line);
        	 line=buffer.readLine();
         }
         file.close();buffer.close();
         
	}

}
