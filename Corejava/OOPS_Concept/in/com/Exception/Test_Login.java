package in.com.Exception;

public class Test_Login {

	public static void main(String[] args) {
		LoginException le=new LoginException();
		String name="Admin";
         if(name.equals("Admn")) {
        	 System.out.println("Valid User");
         }
         else {
			
			try {
			throw le;
			} catch (LoginException e1) {
				System.out.println(e1);
			}
		}
	}

}
