package in.com.Batch;

import java.util.Scanner;

public class Divisible_Example_Lab {

	public static void main(String[] args) {
	         int a=7;
	         int count=0;
	         int sum=0;
	         Scanner sc=new Scanner(System.in);
	         System.out.println("choose your Limit");
	         int limit=sc.nextInt();
	         for (int i = 100; i <limit; i++) {
           		if (i%7==0) {
           			count=i;
           			System.out.println(count);
           			sum =sum+i;
           			
					
				}		
			}
        System.out.println("sum of all your limit"+sum);
	}

}
