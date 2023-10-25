package in.com.home.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	public int id=0;
	public String name=null;
	
}

public class Serialization_Example {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
    FileOutputStream file= new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\File\\test\\Home.txt");
    ObjectOutputStream out=new ObjectOutputStream(file);
    Employee e=new Employee();
    e.id=101;e.name="Himanshu Jain";
    out.writeObject(e);
    out.close();file.close();
    System.out.println("Complete");
    FileInputStream f=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\File\\test\\Home.txt");
    ObjectInputStream in=new ObjectInputStream(f);
    Employee e1=(Employee)in.readObject();
	System.out.println(e1.id);
	System.out.println(e1.name);
	in.close();
	} 

}
