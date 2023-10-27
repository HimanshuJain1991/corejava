package in.com.exception_lab;

class Handle extends RuntimeException{
	public Handle() {
	super("Syntax Error try again");
	}
}

public class Runtime_Exception {

	public static void main(String[] args) {
	  Handle h=new Handle();
	  String name="Admin";
	  if(name.equals("Admin")) {
	  System.out.println("Valid user");
	  }
		   else {
			  try {
				throw h;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	  }

	}

}
