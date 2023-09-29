package in.com.Batch;

import java.util.Scanner;

public class Maximum_Find_Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter the 3 numbers for compare ");
 System.out.println("First a value");
 int a=sc.nextInt();
 System.out.println("Second b value");		
 int b=sc.nextInt();
 System.out.println("Third c value");
 int c=sc.nextInt();
	
		
		if (a>b && a>c) {
			System.out.println("a is2 greater");
			
		}else if(b>c&& b>a){
			System.out.println("b is grater");
		}
		else {
			System.out.println("c is greater");
		}
		
	}

}
