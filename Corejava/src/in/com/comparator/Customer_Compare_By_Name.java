package in.com.comparator;

import java.util.Comparator;

public class Customer_Compare_By_Name implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.cust_name.compareTo(o2.cust_name);
	}

}
