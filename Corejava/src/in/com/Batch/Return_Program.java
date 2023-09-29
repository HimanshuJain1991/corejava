package in.com.Batch;

import java.util.Scanner;

class Employe {	
	int id;
	String Ename;
	int Eage;
	public Employe(int id, String ename, int eage) {
		super();
		this.id = id;
		Ename = ename;
		Eage = eage;
	}

  void sysout() {
	// TODO Auto-generated method stub
	  System.out.println("Employe id is : "+id);
	  System.out.println("Employe name is : "+Ename);
	  System.out.println("Employe age is : "+Eage);

}
		
	}

		
public class Return_Program{
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the employe id : ");
		 int id=sc.nextInt();
		 System.out.println("Enter the employe name :");
		 String Ename=sc.next();
		 System.out.println("Enter the employe age : ");
		 int Eage=sc.nextInt();
	  Employe  Emp=new Employe(id,Ename,Eage);
	  Emp.sysout();
	
	}
     
}

