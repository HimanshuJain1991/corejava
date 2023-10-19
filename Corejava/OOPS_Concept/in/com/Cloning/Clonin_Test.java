package in.com.cloning;

public class Clonin_Test {

	public static void main(String[] args) throws CloneNotSupportedException {
	Cloning_Example cl=new Cloning_Example(101);
	Cloning_Example c2=(Cloning_Example) cl.clone();
	c2.bal=302;
	System.out.println(cl.bal);
	System.out.println(c2.bal);

	}

}
