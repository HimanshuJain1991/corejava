package in.com.input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class File_Example_Lab {

	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("C:\\Users\\ADMIN\\Desktop\\File\\Data1.txt");
		int value=file.read();
		while(value!=-1) {
			System.out.print((char)value);
			value=file.read();
		}
		file.close();
		}

}
