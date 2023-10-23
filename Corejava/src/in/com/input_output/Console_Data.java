package in.com.input_output;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Console_Data {

	public static void main(String[] args) throws IOException {
		System.out.println("Type Data Here...");
		InputStreamReader isr=new InputStreamReader(System.in);
	   BufferedReader buffer=new BufferedReader(isr);
	   FileWriter write=new FileWriter("C:\\Users\\ADMIN\\Desktop\\File\\DemoConsole.txt");
	   PrintWriter pw=new PrintWriter(write);
	   String s=buffer.readLine();
	   while(!(s.equals("Bye"))) {
		   pw.write(s);
		   s=buffer.readLine();
	   }
	   System.out.println("Data Saved In File");
	   isr.close();buffer.close();write.close();pw.close();

	}

}
