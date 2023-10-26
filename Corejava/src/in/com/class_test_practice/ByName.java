package in.com.class_test_practice;

import java.util.Comparator;

public class ByName implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		
		return o1.cust_name.compareTo(o2.cust_name) ;
	}

}
