package in.com.Get_Set_Methods;

public class Traingle extends  Circle {
	private int length=0;
	private int base=0;
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getBase() {
		return base;
	}
	public void area() {
		int Traingle_Area= getLength() * getBase()/2;
		System.out.println("Traingle Area " +Traingle_Area);
	}

}
