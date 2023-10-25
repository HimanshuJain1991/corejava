package in.com.home.inputoutput;

import java.io.File;
import java.util.Date;

public class File_Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\ADMIN\\Desktop\\File\\Keybord.txt");
		if(f.exists()) {
			System.out.println("File Exist"+f.getName());
			System.out.println("File Path"+f.getAbsolutePath());
			System.out.println("--------Access Permission-------");
			System.out.println("can read: "+f.canRead());
			System.out.println("can write:"+f.canWrite());
			System.out.println("can execute"+f.canExecute());
			System.out.println("it is directory: "+f.isDirectory());
			System.out.println("it is file:"+f.isFile());
			Date d=new Date(f.lastModified());
			System.out.println("Last Modified"+d);
			long l=f.length();
			System.out.println("length of file: "+l);
			
		}
		else {
			System.out.println("File not Found");
		}
	}

}
