package in.com.comparator_interface;

public class Customer {
	public int custId;
	public String custName;
	public String custAddress;
	public Customer(int custId,String custName,String custAddress) {
	this.custId=custId;
	this.custAddress=custAddress;
	this.custName=custName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return custId+" "+custName+" "+custAddress;
	}
	public void setcustId(int custId) {
		this.custId=custId;
	}
	public int getcustId() {
		return custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	

}
