package in.com.homepractice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Example {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\ADMIN\\Desktop\\File\\test\\Data2.txt");
         PrintWriter pw=new PrintWriter(fw);
         pw.print("Do Revision make Division");
         System.out.println("task complete");
         pw.close();fw.close();
	}

}
