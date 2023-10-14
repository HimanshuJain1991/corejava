package in.com.comparable;

public class Employee_Sorting implements Comparable<Employee_Sorting> {
       private int e_id;
       private String e_name;
       private String e_mobile;
       public Employee_Sorting(int e_id,String e_name,String e_mobile) {
		this.e_id=e_id;
		this.e_name=e_name;
		this.e_mobile=e_mobile;
	}
	@Override
	public int compareTo(Employee_Sorting o) {
		
		return this.e_id - o.e_id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return e_id+" "+e_name+" "+e_mobile;
	}
}
