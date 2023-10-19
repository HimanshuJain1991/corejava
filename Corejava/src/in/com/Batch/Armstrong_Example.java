package in.com.batch;

public class Armstrong_Example {

	public static void main(String[] args) {
	  int number=371;
	  int rem;
	  int sum=0;
	  int temp=number;
	  while(number>0) {
		  rem=number%10;
		  sum=sum+(rem*rem*rem);
		  number=number/10;
	  }
	  if(sum==temp) {
		  System.out.println("Armstrong");
	  }
	  else {
		  System.out.println("not armstrong");
	  }

	}

}
