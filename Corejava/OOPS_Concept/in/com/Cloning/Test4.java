package in.com.cloning;

public class Test4 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer4 c4=new Customer4("Himanshu",102);
		Customer4 c5= (Customer4) c4.clone();
		c5.name="Ram";
		c5.a4.balance=766;
		System.out.println(c4.name);
		System.out.println(c4.a4.balance);
		System.out.println(c5.name);
		System.out.println(c5.a4.balance);
	}
	
	


}
