package in.com.home_practice;

public class Reverse_Number {

	public static void main(String[] args) {
		int sum=0, num=1347,rem;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		System.out.println(sum);
		

	}

}
