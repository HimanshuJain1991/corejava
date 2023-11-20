package in.com.clone_practice;

public class Customer implements Cloneable{
  public int id=0;
//  public Customer(int id) {
//	this.id=id;
//}
  @Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
}
