package in.com.exception;
class User_Exception extends RuntimeException {
	  public User_Exception() {
		super(" !!!Exception Syntax Error");
	}
}
public class Valid_User {

	public static void main(String[] args) {
		User_Exception ue=new User_Exception();
		//User_Exception ue3=new User_Exception();
		   String name="Admn";
		   if(name.equals("Admin")) {
			   System.out.println("Valid User");
		   }
		   else {
			   try {
				throw ue;
				
			} catch (User_Exception ue1) {
			   System.out.println(ue1.getMessage());
			   //System.out.println(ue1);
			}
		   }
		}

}



