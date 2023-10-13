package in.com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Sorting {

	public static void main(String[] args) {
		ArrayList<Employee_Sorting>e1=new ArrayList<Employee_Sorting>();
		e1.add(new Employee_Sorting(101, "Himanshu Jain", "125466"));
		e1.add(new Employee_Sorting(201, "Ram", "4558222"));
		e1.add(new Employee_Sorting(1, "Ram Sharma", "215"));
		
      System.out.println(e1);
		Collections.sort(e1);
		System.out.println(e1);
		
	}

}
