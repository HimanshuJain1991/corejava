

class Circle {
	void area(int a,int b) {
		System.out.println("cicle class"+a+" "+b);
	
	}
	void area(long c,long s) {
		System.out.println("shape class area"+c+" "+s);
	}
	void radius() {
		System.out.println("circle radius");
	}
}


public class Overloading_Example {

	public static void main(String[] args) {
	Circle c=new Circle();
	c.area( 10,20);
	c.area(30, 40);
	
	
	}

}
