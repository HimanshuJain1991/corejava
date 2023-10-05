package in.com.Cloning;

public class Customer implements Cloneable{
	String name=null;
	
   Account1 account= new Account1();
   public Customer(String name,int balance) {
       this.name=name;
       this.account.balance=balance;
}
   @Override
protected Object clone() throws CloneNotSupportedException {
	  Customer c= (Customer) super.clone();
	c.account=(Account1) account.clone();
	 
	 
	return c;

	   
}
}
