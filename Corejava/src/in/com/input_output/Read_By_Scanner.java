package in.com.input_output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_By_Scanner {

	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("C:\\Users\\ADMIN\\Desktop\\Himanshu\\File.txt");
        Scanner scan=new Scanner(file);
        while(scan.hasNextLine()) {//scan.hasNext()
        	System.out.println(scan.nextLine());
        }
        file.close();
        scan.close();
	}

}
