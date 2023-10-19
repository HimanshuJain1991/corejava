package in.com.cloning;

public class TestAccount1 {

	public static void main(String[] args) throws CloneNotSupportedException {
	Customer c1=new Customer("Himanshu", 500);
	Customer c2=(Customer) c1.clone();
	c2.name="Ram";
	c2.account.balance=122;
	System.out.println(c1.name);
	System.out.println(c1.account.balance);
	System.out.println(c2.name);
	System.out.println(c2.account.balance);
	
	
		}

}
