package in.com.homepractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter_Example {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\ADMIN\\Desktop\\File\\test\\New.txt");
		BufferedWriter bw=new BufferedWriter(fw );
		bw.write("Himanshu Jain"); 
		bw.write("riyansh");
		System.out.println("completed");
		bw.close();fw.close();
	}

}
