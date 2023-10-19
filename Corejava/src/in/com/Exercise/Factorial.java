 package in.com.exercise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your number");
		int p=sc.nextInt();
		
		while(p>=a) {
			
			b=a*b;
			a++;
			
			
		}
		System.out.println("factorial is"+b);
              
	}

}
