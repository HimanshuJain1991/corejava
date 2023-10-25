package in.com.home.inputoutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class PrimitiveDataReadWrite {

	public static void main(String[] args) {
      try {
    
  		  DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\File\\test\\DataType.txt"));
	      dos.writeInt(101);
	     // dos.writeChar('H');
 	      //dos.writeBoolean(true);
	      dos.close();
	      System.out.println("Write complete");
       } catch (Exception e) {
	
       }		
		

	}

}
