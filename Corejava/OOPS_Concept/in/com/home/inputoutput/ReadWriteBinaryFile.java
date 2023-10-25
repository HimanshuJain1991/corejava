package in.com.home.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteBinaryFile {

	public static void main(String[] args)  {
		String source="C:\\Users\\ADMIN\\Desktop\\File\\test//Source.txt";
		String target="C:\\Users\\ADMIN\\Desktop\\File\\test\\Target.txt";
		try {
			FileInputStream fis=new FileInputStream(source);
			FileOutputStream fos=new FileOutputStream(target);
			int data=fis.read();
			while(data!=-1) {
				fos.write(data);
				data=fis.read();
				fos.close();fis.close();
				System.out.println("task Completed");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
