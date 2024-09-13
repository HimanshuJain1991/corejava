package in.com.functionalinterface;

public class Software_Test {

	public static void main(String[] args) {
		//Employee e=new SoftwareDeveloper();normal way
		//System.out.println(e.getName1());
		
		Employee e1=(a,b) -> "Software Engineer2  "+a+" "+b;
		
		Employee e2=(a,b) ->"Hello Rays...";
		System.out.println(e2.getName1(5, 5));
		System.out.println(e2.getClass());
	//	System.out.println(e1.getName1(10,20));
//		Employee e2=()->"Hello Java";
//		System.out.println(e2.getName1());

	}

}
