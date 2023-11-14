package in.com.comparator_interface;

import java.util.Comparator;

public class CompareCustId implements Comparator<Customer> {

	@Override//for desending order
	public int compare(Customer o1, Customer o2) {
		if(o1.custId>o2.custId) {
			return -1;
		}else if(o1.custId==o2.custId) {
			return 0;
		}else {
		return 0;
		}
	}

//	@Override
//	public int compare(Customer c1, Customer c2) {
//		
//		//return  c1.getcustId()-c2.getcustId() ;
//		return c1.custId-c2.custId;
//	}
	
	

}
