package in.com.class_test_practice;

public class Customer {
  public  int cust_id;
  public String cust_name;
  public int cust_account;
  public Customer(int cust_id,String cust_name,int cust_account) {
	  this.cust_id=cust_id;
	  this.cust_name=cust_name;
	  this.cust_account=cust_account;
	// TODO Auto-generated constructor stub
}
  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return cust_id+" "+cust_name+""+cust_account;
	}

}
