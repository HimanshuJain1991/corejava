package in.com.Exercise;

public class Armstrong_Numbers {

	public static void main(String[] args) {
	  int a=371;
	  int b=0;
	  int c;
	  int d=a;
	  
	  while(d>0 ) {
		  c=d%10;
		  b=b+(c*c*c);
		  d=d/10;
	  }
	  if (b==a) {
		  System.out.println("yes armstrong number");
		
	}else {
		System.out.println("no armstrong number");
	}

	}

}
