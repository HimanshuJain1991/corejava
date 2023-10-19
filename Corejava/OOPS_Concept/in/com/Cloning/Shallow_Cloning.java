package in.com.cloning;

public class Shallow_Cloning implements Cloneable {
	 int id;
	 String name;
	 String address;
	public Shallow_Cloning(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	@Override
protected Object clone() throws CloneNotSupportedException {
	Shallow_Cloning sl=(Shallow_Cloning) super.clone();
	return super.clone();
}
}
