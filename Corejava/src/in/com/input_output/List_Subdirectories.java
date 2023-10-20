package in.com.input_output;

import java.io.File;

public class List_Subdirectories {

	public static void main(String[] args) {
	   File dir=new File("C:\\temp");
	   String[] files=dir.list();
	  // System.out.println(files);
	   for (String string : files) {
		System.out.println(string);
//		//-------Create directory-----
//		File subDir=new File(dir,"Hello.txt");
//		
//		System.out.println(subDir.mkdir());
	}

	}

}
