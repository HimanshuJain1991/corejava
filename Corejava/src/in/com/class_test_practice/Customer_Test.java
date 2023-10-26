package in.com.class_test_practice;

import java.util.ArrayList;
import java.util.Collections;

import in.com.comparator.CompareById;

public class Customer_Test {

	public static void main(String[] args) {
	ArrayList<Customer> list=new ArrayList<Customer>();
	list.add(new Customer(258, "Himanshu Jain", 8545));
	list.add(new Customer(480, "Ram", 4548));
	list.add(new Customer(1, "Rahul", 123));
	System.out.println(list);
	System.out.println("-----compare By Id------\n ");
	Collections.sort(list,new ById());
	System.out.println(list);
	System.out.println("----cpmpare by name");
	Collections.sort(list,new ByName());
	System.out.println(list);

	}

}
