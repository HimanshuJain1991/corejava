package in.com.Exercise;

public class Armstrong_Practice {

	public static void main(String[] args) {
		int num=156;
		int rem;
		int sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
			System.out.println("series"+sum);
		}
	   if(sum==temp) {
		   System.out.println("Armstrong number");
	   }
	   else {
		   System.out.println("Not Armstrong");
	   }

	}

}
