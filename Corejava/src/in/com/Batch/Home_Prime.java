package in.com.batch;

public class Home_Prime {

	public static void main(String[] args) {
		int num=13;
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("Not Prime");
		}

	}

}
