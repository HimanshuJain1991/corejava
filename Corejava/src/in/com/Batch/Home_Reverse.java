package in.com.Batch;

public class Home_Reverse {

	public static void main(String[] args) {
	int rem;
	int sum=0;
	int num=123456;
	while(num>0) {
		rem=num%10;
		sum=(sum*10)+rem;
		num=num/10;
	}
		System.out.println(sum);
	}

}
