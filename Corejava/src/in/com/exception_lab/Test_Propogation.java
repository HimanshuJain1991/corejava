package in.com.exception_lab;

public class Test_Propogation {
	
	public static void h1() {
		h2();
	}
	public static void h2() {
		h3();
	}
	public static void h3() {
		try {
			String name="Himanshu Jain";
			System.out.println(name.charAt(15));
		} catch (Exception e) {
			System.out.println(e);
			
		  //e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		h1();

	}

}
