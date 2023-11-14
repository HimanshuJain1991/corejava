package in.com.functionalinterface;

public class Software_Test {

	public static void main(String[] args) {
		//Employee e=new SoftwareDeveloper();normal way
		//System.out.println(e.getName1());
		
		Employee e1=() -> "Software Engineer2";
		System.out.println(e1.getName1());
		Employee e2=()->"Hello Java";
		System.out.println(e2.getName1());

	}

}
