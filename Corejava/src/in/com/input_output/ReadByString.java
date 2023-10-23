package in.com.input_output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadByString {

	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("C:\\Users\\ADMIN\\Desktop\\Himanshu\\File.txt");
		BufferedReader buffer=new BufferedReader(reader);
        String s=buffer.readLine();
        while(s!=null) {
        	System.out.println(s);
        	s=buffer.readLine();
        }
        System.out.println("Read By Buffer");
        reader.close();buffer.close();
	}

}
