package in.com.homepractice;

import java.io.File;

public class File_Directory_Check {

	public static void main(String[] args) {
	int count=0;
       File f=new File("C:\\Users\\ADMIN\\Desktop\\File");
       String s[]=f.list();
       System.out.println("shows file inside the folder");
       
       for (String file : s) {
    	   System.out.println(file);
    	   count++;
	}
       System.out.println("Total file inside the folder:"+count);
       
       System.out.println("create subdiresctory");
       File f1=new File(f,"test");
       boolean b=f1.mkdir();
       System.out.println("folder created successfuuly: "+b);
       
	}

}
