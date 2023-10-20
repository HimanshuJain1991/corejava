package in.com.input_output;

import java.io.File;

public class Create_File {

	public static void main(String[] args) {
//		File file=new File("C:\\temp\\B.txt");
//		boolean b=file.renameTo(new File("C:\\temp\\C.txt"));
//	  System.out.println("done"+b);
//		//file.delete();
//		//file.deleteOnExit();
//		
		File f=new File("C:\\temp\\E.txt");
		boolean b=f.renameTo(new File("C:\\temp\\New3.txt"));
		System.out.println("file rename Succesful"+b);
		//f.delete();
 
	}

}
