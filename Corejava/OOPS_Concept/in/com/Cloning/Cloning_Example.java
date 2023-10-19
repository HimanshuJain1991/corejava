package in.com.cloning;

public class Cloning_Example implements Cloneable {
	int bal;
	public Cloning_Example(int bal) {
		this.bal=bal;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
