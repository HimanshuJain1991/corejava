package in.com.input_output;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConsoleToFileData {

	public static void main(String[] args) throws IOException {
		System.out.println("Type here data");
		InputStreamReader isReader=new InputStreamReader(System.in);
		BufferedReader buffer= new BufferedReader(isReader);
		FileWriter write=new FileWriter("C:\\Users\\ADMIN\\Desktop\\File\\Keybord.txt");
         PrintWriter pw=new PrintWriter(write);
         String line=buffer.readLine();
         while(!(line.equals("Tata"))){
        	 pw.println(line);
        	 line=buffer.readLine();
         }
         System.out.println("Completed");
         isReader.close();buffer.close();write.close();pw.close();
	}

}
