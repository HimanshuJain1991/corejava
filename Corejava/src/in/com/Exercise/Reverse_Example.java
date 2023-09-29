package in.com.Exercise;

public class Reverse_Example {

	public static void main(String[] args) {
		 int number=1234;
		  int rem;
		  int sum=0;
		  int temp=number;
		  while(number>0) {
			  rem=number%10;
			  sum=sum*10+(rem);
			  number=number/10;
		  }
		  System.out.println(sum);

	}

}
