package in.com.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Lavish_Serialization {

	public static void main(String[] args) {
		try {
			String source="C:\\Users\\ADMIN\\Desktop\\File\\Lavish_marks.txt";
			
			FileOutputStream in=new FileOutputStream(source);
			ObjectOutputStream out=new ObjectOutputStream(in);
			Lavish_Marks lm=new Lavish_Marks(99, 100);
			System.out.println(lm.hindi+"  "+lm.maths);
			out.writeObject(lm);
			out.close();
			System.out.println("Completed");
			
			FileInputStream file=new FileInputStream(source);
			ObjectInputStream ois=new ObjectInputStream(file);
		
			Lavish_Marks lm1=(Lavish_Marks) ois.readObject();
			System.out.println("Hindi"+lm1.hindi+" "+"Maths"+lm1.maths);
			ois.close();
			System.out.println("Completed");
			
		} catch (Exception e) {
		System.out.println(e);
		}
		

	}

}
