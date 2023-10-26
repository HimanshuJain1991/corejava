package in.com.class_test_practice;

import java.util.Comparator;

public class ById implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.cust_id-o2.cust_id;
	}

}
