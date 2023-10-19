package in.com.get_set_methods;

public class Circle extends Shape   {
	public static final double PI=3.14;
	private double radius=0.0;
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void area() {
		double Circle_Area= PI * getRadius() * getRadius();
		System.out.println("Circle Area = "+ Circle_Area);
	}

}
