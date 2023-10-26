package in.com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Customer_Test {

	public static void main(String[] args) {
		ArrayList<Customer> list=new ArrayList<Customer>();
//		Customer c=new Customer(45, "Amit", "12/4/1992");
//		list.add(c);
		list.add(new Customer(548, "Himanshu Jain", "19/01/1992"));
		list.add(new Customer(698, "Ram Sharma","15/05/1993"));
		list.add(new Customer(265, "Lokesh", "02/01/1998"));
		System.out.println(list);
		System.out.println("-----Comparator by id-----");
		Collections.sort(list,new Customer_Compare_By_Id());
		System.out.println(list);
		System.out.println("-------Compare By Name------");
		Collections.sort(list,new Customer_Compare_By_Name());
		System.out.println(list);
		System.out.println("-----Compare By DOB-----");
		Collections.sort(list,new Customer_Compare_By_DOB());
		System.out.println(list);

	}

}
