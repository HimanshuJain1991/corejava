package in.com.input_output;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\ADMIN\\Desktop\\Himanshu\\File.txt");
		if(file.exists()) {
			System.out.println("Name of file:"+file.getName());
			System.out.println("your file path is: "+file.getAbsolutePath());
			System.out.println("------Check Access Permission--------");
			System.out.println("Writable: "+file.canWrite());
			System.out.println("Readble: "+file.canRead());
			System.out.println("----Check if it is directory or a file---------");
			System.out.println("Is File: "+file.isFile());
			System.out.println("Is Dir:"+file.isDirectory());
			System.out.println("-----Last Modified Date of file and directory ------");
			Date d=new Date(file.lastModified());
			System.out.println("Last Modified: "+d);
			System.out.println("------Length of File-------");
			long length=file.length();
			System.out.println("Length of file is:"+length); 
		}else {
			System.out.println("File not found");
		}
		

	}

}
