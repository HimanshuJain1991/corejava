package in.com.cloning;

public class Deepcloning2 implements Cloneable {
    String name;
    Deepclonig_1 d1=new Deepclonig_1();
    public Deepcloning2(String name,int id) {
		this.name=name;
		this.d1.id=id;
	}
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	Deepcloning2 d=(Deepcloning2) super.clone();
    	d.d1=(Deepclonig_1) d1.clone();
    	return d;
    }
     
}
