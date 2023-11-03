package in.com.threads_example_syncronized;

public class Racing extends Thread{
	private String name=null;
	static Account ac=new Account();
	public Racing(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			ac.deposit(name, 10);
		}
		
	}

}
