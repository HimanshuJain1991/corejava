package in.com.homepractice;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\ADMIN\\Desktop\\File\\test\\Rename2.txt");
		f.renameTo(new File("C:\\Users\\ADMIN\\Desktop\\File\\test\\Data.txt"));
        System.out.println("rename file completed");
     // boolean b=f.delete();
     // System.out.println("file deleted"+b);
	}

}
