package in.com.Cloning;

public class Customer2 implements Cloneable {
	int c_id;
      Account2 a2=new Account2();
	public Customer2(int c_id,int a_salary,String a_name) {
		this.c_id=c_id;
		this.a2.salary=a_salary;
		this.a2.name=a_name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer2 cs=(Customer2) super.clone();
		cs.a2=(Account2) a2.clone();
		return  cs;
	}
}
