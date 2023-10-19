package in.com.input_output;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Write {

	public static void main(String[] args) throws IOException {
	  FileWriter writer=new FileWriter("C:\\Users\\ADMIN\\Desktop\\Himanshu\\NewFile.txt");
     System.out.println("Writ Here for file.... ");
	  Scanner scan=new Scanner(System.in);
     String str=scan.nextLine();
	  writer.write(str);
       writer.close();
       System.out.println("Congraulation your 1st file is created successfully!!!");
	}

}
