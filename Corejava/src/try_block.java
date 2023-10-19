
public class try_block extends Exception {

	public static void main(String[] args) {
		
	try {
		int a=100,b=0,c;
		c=a/b;
		
		//String s="himanshu";
		//s.charAt(8);
	}catch (ArithmeticException  |NullPointerException e ) {
		System.out.println(e.getMessage());
		//e.printStackTrace();
	}
	finally  {
		System.exit(0);
		System.out.println("Finally");
	}
		


	}

}
