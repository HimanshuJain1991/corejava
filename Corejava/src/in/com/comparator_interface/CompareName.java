package in.com.comparator_interface;

import java.util.Comparator;

public class CompareName implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return o1.custName.compareTo(o2.custName);
		
	}

}
