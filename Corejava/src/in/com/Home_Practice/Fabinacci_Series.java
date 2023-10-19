package in.com.home_practice;

public class Fabinacci_Series {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println(""+a+"\n"+b);
		for(int i=0;i<=10;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}

	}

}
