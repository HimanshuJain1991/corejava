package in.com.inheritance;

public class Test_Shape {

	public static void main(String[] args) {
	 
		System.out.println("----Shape class-------");
	   Shape s=new Shape();
	   s.setBorderWidth(45);
	   s.setColor("Green");
	   System.out.println(s.getBorderWidth());
	   System.out.println(s.getColor());
	   System.out.println("----Rectangel class-------");
	   
		Rectangle rc=new Rectangle();
		rc.setLength(10);rc.setWidth(12);
		System.out.println(rc.getLength());
		System.out.println(rc.getWidth());
	

	}

}
