package in.com.clone_practice;

public class Employee implements Cloneable {
	Customer c=new Customer();
	public String empName=null;
	public String empAddress=null;
	public Employee(int id,String empName,String empAddress) {
		this.c.id=id;
		this.empName=empName;
		this.empAddress=empAddress;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee e3=(Employee) super.clone();
		e3.c=(Customer) c.clone();
		return e3;
	}

}
