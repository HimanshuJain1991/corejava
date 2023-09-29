package in.com.Batch;

import java.util.Scanner;

public class Scanner_Array_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Please enter the size of array here");
     int size=sc.nextInt();
     int number1[]=new int[size];
     
     //for(int i=0;i<number1.length;i++) {
    //	 System.out.println(number1[i]);
     //}
     System.out.println("Enter the values");
     for(int j=0;j<number1.length;j++) {
    	 number1[j]=sc.nextInt();
    	 
    	 
    	 
     }
     
     System.out.println("serch the indexing");
     int x=sc.nextInt();
     
     //System.out.println("your enterd number is:");
     for (int i = 0; i < number1.length; i++) {
		//System.out.println(number1[i]);
    	 if(number1[i]==x) {
    		 System.out.println("index number"+i);
    	 }
   
    	 
	}
     
	}

}
