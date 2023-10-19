package in.com.cloning;

public class Account1 implements Cloneable {
int balance;
int salary=20; 
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}  
}
