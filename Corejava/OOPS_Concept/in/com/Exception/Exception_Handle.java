package in.com.exception;

public class Exception_Handle {
	public static void d1() {
		d2();
	}
	public static void d2() {
		d3();
	}
	public static void d3() {
		try {
			String name="Prachi";
			System.out.println(name.charAt(7));
		} catch (Exception e) {
		System.out.println(e);
		}
	}

	public static void main(String[] args) {
	
   d1();
	}

}
