package in.com.home.inputoutput;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\ADMIN\\Desktop\\File\\test\\Create.txt",true);;
         fw.write("Today is Monday");
         fw.close();
         System.out.println("Append is completed"); 
	}
}  
