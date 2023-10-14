package in.com.comparator;

import java.util.Comparator;

public class CompareById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmp_id()-o2.getEmp_id();
	}
	
	

}
