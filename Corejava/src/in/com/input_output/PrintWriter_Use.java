package in.com.input_output;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Use {

	public static void main(String[] args) throws IOException {
		FileWriter write=new FileWriter("C:\\Users\\ADMIN\\Desktop\\File\\PrintWriter.txt");
       PrintWriter print=new PrintWriter(write);
       print.println("Hello Every one");
       print.println("Rays Institute");
       write.close();
       print.close();
       System.out.println("Completed");
	}
	
}
