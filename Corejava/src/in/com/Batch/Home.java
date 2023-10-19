package in.com.batch;

public class Home {
public static void main(String[] args) {
	int num=111;
	int rem;
	int sum=0;
	int temp=num;
	while(num>0) {
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
		
	}
	System.out.println(sum);
	if(sum==temp) {
		System.out.println("number is Armstrong");
	}
	else {
		System.out.println("number is not armstrong");
	}
}

	

	}

