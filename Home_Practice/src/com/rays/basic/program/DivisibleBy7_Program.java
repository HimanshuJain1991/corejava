package com.rays.basic.program;

public class DivisibleBy7_Program {

	public static void main(String[] args) {
		int count=0,sum=0;
		for(int i=100;i<=200;i++) {
			if(i%7==0) {
				count=i;
				System.out.println(count);
				sum=sum+count;
			}
			
		}
		
		System.out.println(sum);

	}

}
