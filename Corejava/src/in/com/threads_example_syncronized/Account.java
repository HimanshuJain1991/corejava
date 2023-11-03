package in.com.threads_example_syncronized;

public class Account {
	private int balance=0;
	public Account() {
		
	}
	public void setBalance(int total ) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.balance=total;
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
		int total =getBalance()+amount;
		setBalance(total);
		System.out.println(name+" "+getBalance());
	}

}
