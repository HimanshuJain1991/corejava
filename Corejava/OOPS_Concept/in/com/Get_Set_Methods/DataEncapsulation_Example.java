package in.com.get_set_methods;

class Test1{
	 private int account_num;
	  private String account_name;
	public void setAccount_Num(int account_num) {
		this.account_num=account_num;
	}
	public int getAccount_Num() {
		return account_num;
	}
	public void setAccount_Name(String account_name) {
		this.account_name=account_name;
	}
	public String getAccount_Name() {
		return account_name;
	}
}
public class DataEncapsulation_Example {

	public static void main(String[] args) {
		Test1 t1= new Test1();
	t1.setAccount_Name("Himanshu jain");
		System.out.println(t1.getAccount_Name());
		t1.setAccount_Num(110);
		System.out.println(t1.getAccount_Num());
		
		t1.hashCode();
		System.out.println(t1);
    

	}

}
