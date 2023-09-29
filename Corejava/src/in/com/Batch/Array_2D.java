package in.com.Batch;

import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int i;
		int num[]=new int[size];
		System.out.println("Enter the values for array");
		for( i=0;i<num.length;i++) {
			//System.out.println(num[i]);
			 num[i]=sc.nextInt();
			 //System.out.println(num[i]);
		}
		System.out.println("Enter number for indexing");
		int index=sc.nextInt();
		for (int j = 0; j < num.length; j++) {
			if(num[j]==index) {
				//System.out.println("your number is: "+num[j]);
				System.out.println("index number is:"+j);
			}
		}
	}

}
