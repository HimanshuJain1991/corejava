package in.com.oops_test;

public class Method_Overloading {
	public void sum(int a,int b) {
		int c=a+b;
		System.out.println("Addition is:"+c);
	}
	public void sum(double a,double b) {
		double d=a*b;
		System.out.println("Multiplication"+d);
	}
	public void sum(float d,float v,int a) {
		float g=d/v;
		float m=v+a;
		System.out.println("division is"+g+" addition is"+m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Method_Overloading mo=new Method_Overloading();
      mo.sum(10, 20);
      mo.sum(10.5, 36.5);
      mo.sum(10.5f, 5.5f, 89);
	}

}
