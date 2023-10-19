package in.com.exception;

public class TestProgation {

	public static void main(String[] args) {
	
       m1();
       m4();
	}
	public static void m1() {
		
		m2();
	}
	public static void m2() {
		try {
			m3();
		} catch (Exception e) {
			System.out.println(e+" give right postion");
		
		}
	}
	public static void m3() {
		String name="Hariom";
		System.out.println(name.charAt(11));
	}
	public static void m4() {
		try {
			int sum=0;
			int rem;
			int num=37;
			int temp=num;
			while(num>0) {
				rem= num%10;
				sum=sum+(rem*rem*rem);
				num=num/10;
				if(sum==temp) {
					System.out.println(sum+"Armstrong number");
				}
				else {
					System.out.println("Not Armstrong");
				}
			} 
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
//	public static void m5() {
//		 try {
//			 m4();
//		 }catch (LoginException e) {
//			System.out.println(e+"developer logic problem");
//		}
//	}

}
