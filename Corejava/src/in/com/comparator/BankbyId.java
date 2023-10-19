package in.com.comparator;

import java.util.Comparator;

public class BankbyId implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		
		return o1.getB_id()-o2.b_id;
	}

}
