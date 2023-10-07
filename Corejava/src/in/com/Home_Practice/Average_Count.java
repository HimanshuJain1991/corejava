package in.com.Home_Practice;

public class Average_Count {

	public static void main(String[] args) {
		int number=10;
		int sum=0;
		int avg;
		int count=0;
		for (int i = 1; i <=number; i++) {
			if(i%2==0) {
				sum=sum+i;
				count++;
			}
		}
		avg=sum/count;
		System.out.println("average is"+avg);

	}

}
