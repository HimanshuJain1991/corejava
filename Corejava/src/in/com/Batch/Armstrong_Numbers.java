package in.com.batch;

public class Armstrong_Numbers {

	public static void main(String[] args) {
	  int a=371;
	  int b=0;
	  int c;
	  int temp=a;
	  
	  while(temp>0 ) {
		  c=temp%10;
		  b=b+(c*c*c);
		  temp=temp/10;
	  }
	  if (b==a) {
		  System.out.println("yes armstrong number");
		
	}else {
		System.out.println("no armstrong number");
	}

	}

}
