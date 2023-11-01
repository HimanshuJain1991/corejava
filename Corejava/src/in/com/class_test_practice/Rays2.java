package in.com.class_test_practice;

public class Rays2  implements Cloneable{
	Rays1 r1=new Rays1();
	String name=null;
	public Rays2(String name,int rays_Id) {
	   this.name=name;
	   this.r1.rays_Id=rays_Id;
	}
@Override
protected Object clone() throws CloneNotSupportedException {
	     Rays2 r2 =(Rays2) super.clone();
	     r2.r1= (Rays1) r1.clone();
	return r2;
}
}
