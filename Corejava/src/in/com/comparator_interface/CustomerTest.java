package in.com.comparator_interface;

import java.util.ArrayList;
import java.util.Collections;

import in.com.comparator.CompareByName;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList <Customer > list=new ArrayList<Customer>();
		list.add(new Customer(222, "Himanshu Jain", "Indore"));
		list.add(new Customer(506, "Ram Sharma", "Ujjain"));
		list.add(new Customer(101, "Ram Sharma", "Bhopal"));
		System.out.println(list);
		System.out.println("Compare By id");
		Collections.sort(list, new CompareCustId());
		System.out.println("compare by name");
		Collections.sort(list,new CompareName());
		System.out.println(list);

	}

}
