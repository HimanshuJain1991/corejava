package in.com.Batch;

import java.util.Scanner;

public class Scanner_Class_Work {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int number1[]=new int[size];
		System.out.println("enter the values");
		for (int i = 0; i < number1.length; i++) {
			number1[i]=sc.nextInt();
			
		}
		System.out.println("Search your indexing");
		int x=sc.nextInt();
		for (int j = 0; j < number1.length; j++) {
			if(number1[j]==x) {
				System.out.println(j);
			}
		}
		

	}

}
