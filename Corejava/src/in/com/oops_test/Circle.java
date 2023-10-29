package in.com.oops_test;

public class Circle extends Shape {
      
      private final double PI=3.14;
      public void radius(double radius) {
    	  double rad=PI*radius*radius;
    	  System.out.println("Circle Radius"+rad);
      }
}
