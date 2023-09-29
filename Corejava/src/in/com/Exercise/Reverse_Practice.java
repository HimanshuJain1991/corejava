package in.com.Exercise;

import java.util.Scanner;

public class Reverse_Practice {

	public static void main(String[] args) {
	int rem;
	int sum=0;
	System.out.println("Enter Number for Reverse");
	Scanner sc =new Scanner(System.in);
	int num=sc.nextInt();
	
	while(num>0) {
		rem=num%10;
		sum=(sum*10)+(rem);
		num=num/10;
	}
	System.out.println("Reverse number is: "+sum);

	}

}
