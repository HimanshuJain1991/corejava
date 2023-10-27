package in.com.exception;
class Activate extends RuntimeException{
	
	public Activate() {
		// TODO Auto-generated constructor stub
		super("Error Syntax");
	}
}

public class Check {

	public static void main(String[] args) {
		Activate ac=new Activate();
		String name="Admin";
		if(name.equals("Admn")) {
			System.out.println("Valid user");
		}
		else {
			try {
				
				throw ac;
			} catch (Exception e) {
			    System.out.println(e);
			}
		}

	}

}
