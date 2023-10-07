package in.com.Exception;

public class Exception_Program {

	public static void main(String[] args) {
		try {
			int a=20;
			int b=5;
			int c;
	           c=a/b;
	           System.out.println(c);
			
		}catch (Exception e) {
			System.out.println("Use Proper Input");
		}
		finally {
			System.out.println("it will  run always");
		}
	} 		

}
