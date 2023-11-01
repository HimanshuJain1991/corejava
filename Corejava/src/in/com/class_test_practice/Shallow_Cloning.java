package in.com.class_test_practice;

public class Shallow_Cloning implements Cloneable {
	public int id=0;
	String name=null;
	String address=null;
	public Shallow_Cloning(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
