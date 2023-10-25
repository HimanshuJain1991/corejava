package in.com.comparator;

import java.util.Comparator;

public class Customer_Compare_By_DOB implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		
		return o1.cust_dob.compareTo(o2.cust_dob);
	}

}
