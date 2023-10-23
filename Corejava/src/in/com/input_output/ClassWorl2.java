package in.com.input_output;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ClassWorl2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Write Here");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader buffer=new BufferedReader(isr);
		FileWriter write=new FileWriter("C:\\Users\\ADMIN\\Desktop\\File\\Work.txt",true);
        PrintWriter pr=new PrintWriter(write);
        String s=buffer.readLine();
        while(!(s.equals("Tata"))) {
        	
        	pr.println(s);
        	s=buffer.readLine();
        }
        System.out.println("Completed");
        isr.close();buffer.close();write.close();pr.close();
	}

}
