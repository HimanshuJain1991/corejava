package in.com.polymorphism;

public class Method_Overloading {
	public void sum(int a,int b) {
		int c=a+b;
		System.out.println("addition is="+c);
	}
	public void sum(int a,int b,int c) {
		int d=a*b*c;
		System.out.println("Multiplication is:"+d);
	}
	public void sum(int a,double b) {
		double c=a/b;
		System.out.println("division is"+c);
	}

	public static void main(String[] args) {
		Method_Overloading mo=new Method_Overloading();
		mo.sum(10, 20);
		mo.sum(14, 45, 50);
		mo.sum(10, 10.5);
	

	}

}
