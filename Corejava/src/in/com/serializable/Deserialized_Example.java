package in.com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

     
    public class Deserialized_Example {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	FileOutputStream in=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\File\\Change.txt");
    ObjectOutputStream out=new ObjectOutputStream(in);
	Marks m=new Marks();
	m.setJava(88);m.setMaths(45);m.setPython(69);
	out.writeObject(m); 
	System.out.println(m.getJava()+" "+m.getMaths()+" "+m.getPython());
	in.close();out.close();
	FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\File\\Change.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
    Marks m1=(Marks)ois.readObject();
	System.out.println("----Deserializition----");
	//System.err.println("Error");
	 System.out.println(m1.getJava());
	 System.out.println(m1.getMaths());
	 System.out.println(m1.getPython());
      fis.close();ois.close();
	}
}
