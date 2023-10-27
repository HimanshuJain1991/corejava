package in.com.polymorphism;

class Rectangle{

   public void area() {
	   System.out.println("Parent class area Method");
	   int length=39,width=20;
	  int area= length*width;
	  System.out.println(area);
   }
}
class Circle extends Rectangle{
	public void area() {
		System.out.println("Child class area method");
		double PI=3.14;
		int radius=5;
		double area=PI*radius*radius;
		System.out.println(area);
	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		Rectangle rc=new Circle();
		rc.area();
		

	}

}
