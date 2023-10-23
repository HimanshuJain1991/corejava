package in.com.serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class  Marksheet implements Serializable{
	public String name=null;
	public int maths=0;
	public int english=0;
	public int java=0;
	
	
}
public class Serializable_Example {

	public static void main(String[] args) throws IOException {
		FileOutputStream in=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\File\\Marksheet.txt");
        ObjectOutputStream out= new ObjectOutputStream(in);
		Marksheet m=new Marksheet();
		m.name="Himanshu jain";
		m.maths=100;
		m.english=89;
		m.java=99;
		out.writeObject(m);
		
		in.close();out.close();
		System.out.println("Data write Successfully");
		

	}

}
