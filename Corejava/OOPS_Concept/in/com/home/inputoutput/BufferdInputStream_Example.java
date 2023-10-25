package in.com.home.inputoutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferdInputStream_Example {

	public static void main(String[] args) {
		try {
			String source="C:\\Users\\ADMIN\\Desktop\\File\\test\\Source.txt";
			String target="C:\\Users\\ADMIN\\Desktop\\File\\test\\Girl.txt";
			FileInputStream fis=new FileInputStream(source);
			BufferedInputStream bis=new BufferedInputStream(fis);
			FileOutputStream fos=new FileOutputStream(target);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			byte[] buff=new byte[1];
			int i=fis.read(buff);
			while(i>0) {
				bos.write(buff, 0, i);
				i=fis.read(buff);
				
			}
			bos.close(); 
			System.out.println("completed");
		    
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		}
		}
		

	}


