package in.com.comparator;

public class Customer {
  public int cust_id;
  public String cust_name;
  public String cust_dob;
  public Customer(int cust_id,String cust_name,String cust_dob) {
	this.cust_id=cust_id;
	this.cust_name=cust_name;
	this.cust_dob=cust_dob;
}  
  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return cust_id+" "+cust_name+" "+cust_dob;
	}
}
