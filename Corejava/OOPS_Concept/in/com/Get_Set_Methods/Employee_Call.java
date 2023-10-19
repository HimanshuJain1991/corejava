package in.com.get_set_methods;

import java.util.Scanner;

public class Employee_Call {

	public static void main(String[] args) {
		Employee_Details ed=new Employee_Details();
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter Id");
	 int p_id=sc.nextInt();
	 System.out.println("Enter Age ");
	 int s_age=sc.nextInt();
		ed.setId(p_id);
		ed.setAge(s_age);
		
		System.out.println(ed.getId());
		System.out.println(ed.getAge());

	}

}
