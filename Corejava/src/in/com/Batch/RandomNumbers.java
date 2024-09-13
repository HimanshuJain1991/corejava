package in.com.batch;

import java.util.Random;

public class RandomNumbers {
    
	public static void main(String[] args) {
		 Random random=new Random();
	 for(int i=1;i<=5;i++) {
		 int numbers=1+random.nextInt(100);
		 System.out.println(i+"st Number="+numbers);
	 }
	 

	}

}
