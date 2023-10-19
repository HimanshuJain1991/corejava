package in.com.get_set_methods;


public class Test_Rectangle  {

	public static void main(String[] args) {
		Shape_Rectangle sr=new Shape_Rectangle();
		sr.setLength(10);
		sr.setWidth(20);
		sr.area();
		Shape s=new Shape();
		s.area();
		
		Circle c=new Circle();
		c.setRadius(20);
		c.area();
		
		
		Traingle t=new  Traingle();
		t.setLength(30);
		t.setBase(10);
		t.area();
		
//		System.out.println("Array Work Program");
//		int array[]=new int[3];
//			array[0]=5;
//		 t.setLength(array[0]);
//		t.setRadius(4);
//			array[1]=8;
//			 t.setBase(array[1]);
//			 t.area();
//			 c.area();
		
		
		//Array to class 	
		Shape[] s1=new Shape[3];
		s1[0]= new Shape_Rectangle();
		s1[1]= new Circle();
		s1[2]= new Traingle();
		Shape_Rectangle sr1=(Shape_Rectangle)  s1[0];
		sr1.setLength(10);
		sr1.setWidth(5);
		sr1.area();
		 
		Circle c1= (Circle)s1[1];
		c1.setRadius(8);
		c1.area();
		
		Traingle t1=(Traingle)s1[2];
		t1.setLength(78);
		t1.setBase(8);
		t1.area();
		
		
		
		
	
		
		
		}
}
			
			