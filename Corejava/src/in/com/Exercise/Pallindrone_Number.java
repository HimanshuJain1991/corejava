package in.com.exercise;

public class Pallindrone_Number {

	public static void main(String[] args) {
		int num=121;
		int sum=0;
		int rem;
		int temp=num;
		while(num >0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Pallindrone");
		}
		else {
			System.out.println("Not pallindronr");
		} 

	}

}
