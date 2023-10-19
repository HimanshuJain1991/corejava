package in.com.batch;

public class Switch_Example2 {

	public static void main(String[] args) {
	
		String str="March";
		switch (str) {
		case "January":
			System.out.println("1st month");
			
			break;
		case "Febuary":
			System.out.println("2nd month");
			
			break;
		case "March":
			System.out.println("3rd month");
			
			break;
		case "April":
			System.out.println("4th month");
			
			break;

		default:
			System.out.println("default case");
			break;
		}

	}

}
