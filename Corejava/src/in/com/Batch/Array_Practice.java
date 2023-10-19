package in.com.batch;

import java.util.Scanner;

public class Array_Practice {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int array1[]=new int[size];
		System.out.println("Enter the elemnts");
		for (int i = 0; i < array1.length; i++) {
			array1[i]=s.nextInt();
			//System.out.println(array1[i]);
		}
		System.out.println("Enter the value find");
		int value=s.nextInt();
		for(int j=0;j<array1.length;j++) {
			if(array1[j]==value) {
			System.out.println("Index number is= "+j);	
			}
		}
		

	}

}
