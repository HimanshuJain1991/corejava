package in.com.exercise;

public class Prime_Number_Practice {

	public static void main(String[] args) {
		 int num=7;
		 int count=0;//1 to 7 //numbers between 2 to 6 loop is work
		 for(int i=2;i< num;i++) {
			 if(num%i==0) {
				 count++;
			 }
			 
		 }
		 if(count==0) {
			 System.out.println("prime number");
		 }
		 else {
			 System.out.println("not prime");
		 }

	}

}
