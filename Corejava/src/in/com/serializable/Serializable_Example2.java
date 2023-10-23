package in.com.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable_Example2 {

	public static void main(String[] args) throws IOException {
     	FileOutputStream in= new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\File\\Mark.txt");	
        ObjectOutputStream out=new ObjectOutputStream(in);
        Marks m=new Marks();
        m.setJava(100);m.setMaths(99);m.setPython(99);
        out.writeObject(m);
       System.out.println("Marks:"+m.getJava()+" "+m.getMaths()+" "+m.getPython());
	   in.close();out.close();
	}
         
}
