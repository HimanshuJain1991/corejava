package in.com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Data implements Serializable{
	public int id=0;
	String name=null;
	transient  int marks=100;
}

public class Data_Enrypt {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos=new FileOutputStream("E:\\Himanshu\\DataEncrpt.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Data d=new Data();
		d.id=101;d.name="Himansu Jain";
		oos.writeObject(d);
		System.out.println("Completed Task");
		FileInputStream fis=new FileInputStream("E:\\Himanshu\\DataEncrpt.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Data d1=(Data)ois.readObject();
        System.out.println(d1.id+"  "+d1.name+" "+d1.marks);

	}

}
