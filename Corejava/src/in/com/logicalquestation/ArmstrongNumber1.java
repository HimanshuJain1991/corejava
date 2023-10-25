package in.com.logicalquestation;

public class ArmstrongNumber1 {

	public static void main(String[] args) {
		int num=371;
		int sum=0;
		int rem;
		int temp=num;
		
		while(temp>0) {
	
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		System.out.println(sum);
		if(sum==num) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		
	}
}
