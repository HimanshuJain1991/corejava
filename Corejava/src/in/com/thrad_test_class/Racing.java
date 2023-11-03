package in.com.thrad_test_class;

public class Racing extends Thread {
  public String name=null;
  public Racing(String name) {
	this.name=name;
}
  static Account ac =new Account();
  @Override
	public void run() {
	  for(int i=1;i<=10;i++) {
		ac.deposit(name, 10);
	  }
		super.run();
	}
}
