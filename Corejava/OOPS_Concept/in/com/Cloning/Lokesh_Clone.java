package in.com.cloning;

public class Lokesh_Clone implements Cloneable {
	String name;
	Amit_Clone ac= new Amit_Clone();
	public Lokesh_Clone(String name,int balance) {
		this.name=name;
		this.ac.balance=balance;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Lokesh_Clone lc=(Lokesh_Clone) super.clone();
		lc.ac=(Amit_Clone) ac.clone();
		return lc;
	}
	
	
	

}
