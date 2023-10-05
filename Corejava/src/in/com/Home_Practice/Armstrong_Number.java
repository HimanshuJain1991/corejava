package in.com.Home_Practice;

public class Armstrong_Number {

	public static void main(String[] args) {
		int rem;
		int sum=0;
	int num=371;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		} 
if(temp==sum) { 
	System.out.println("Armstrong number");
	
}
else {
	System.out.println("Not Armstrong");
}
	}

}
