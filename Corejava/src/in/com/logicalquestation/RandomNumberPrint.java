package in.com.logicalquestation;

import java.util.Random;

public class RandomNumberPrint {

	public static void main(String[] args) {
		Random r=new Random();
		for(int j=1;j<=5;j++) {
		int i=r.nextInt(100);
		System.out.println(i);
		}
		
	

	}

}
