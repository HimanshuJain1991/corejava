package in.com.clone_practice;

public class ShallowClone implements Cloneable {
	public int id=0;
	public ShallowClone(int id) {
		this.id=id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
