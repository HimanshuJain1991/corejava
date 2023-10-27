package in.com.exception;
class  Admin_Check extends RuntimeException{
	public Admin_Check() {
		// TODO Auto-generated constructor stub
		super("syntax Error");
	}
}

public class HariOm {

	public static void main(String[] args) {
		Admin_Check ac=new Admin_Check();
		String name="Hariom";
		if(name.equals("Harim")) {
			System.out.println("Valid Name");
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
