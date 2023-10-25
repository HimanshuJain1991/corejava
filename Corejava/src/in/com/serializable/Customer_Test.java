package in.com.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Customer_Test {

	public static void main(String[] args) {
		try {
			FileOutputStream file=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\File\\test\\Customer.txt");
		  ObjectOutputStream out=new ObjectOutputStream(file);
		  Customer c=new Customer();
		  c.id=101;
		  c.name="Himanshu Jain";
		  out.writeObject(c);
		  out.close();
		  System.out.println("Completed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		

	}

}
