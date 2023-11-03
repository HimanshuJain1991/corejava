package in.com.thrad_test_class;

public class Account {
	private int balance=0;
	
	public void setBalance(int balance) {
		
		try {
			
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		this.balance = balance;
	}
	public int getBalance() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return balance;
	}
	
	public synchronized void deposit(String name,int amount) {
		int toatal=getBalance()+amount;
		setBalance(toatal);
		System.out.println(name+" "+getBalance() );
	}

}
