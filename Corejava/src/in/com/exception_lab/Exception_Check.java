package in.com.exception_lab;

public class Exception_Check {

	public static void main(String[] args) {
		try {
			int a=20,b=0,c;
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
		//System.out.println(e.getMessage());
		System.err.print(e);
	
		}
		finally {
			System.out.println("Finally block is running");
		}

	}

}
