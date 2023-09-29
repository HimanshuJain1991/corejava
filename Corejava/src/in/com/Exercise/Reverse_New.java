package in.com.Exercise;

public class Reverse_New {

	public static void main(String[] args) {
          
		int a=123456;
		int b=0;
		int c;
		
		while(a>0) {
			
			c=a%10;
			b=b*10+c;
			a=a/10;
			
			
		}
		System.out.println(b);

	}

}
