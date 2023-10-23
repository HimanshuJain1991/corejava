package in.com.input_output;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ClassWork1 {

	public static void main(String[] args) throws IOException {
//		FileReader file=new FileReader("C:\\Users\\ADMIN\\Desktop\\File\\Keybord.txt");
//          int value= file.read();
//          while(value!=-1) {
//        	  System.out.print((char)value);
//        	  value=file.read();
//          }
//          file.close();
		FileReader file=new FileReader("C:\\Users\\ADMIN\\Desktop\\File\\Keybord.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNext()) {
			//String s=sc.nextLine();
			System.out.println(sc.nextLine());
			
		}
		file.close();
	}

}
