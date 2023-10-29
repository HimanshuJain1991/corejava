package in.com.oops_test;

public class Abstract_Test {

	public static void main(String[] args) {
	   Abstract_Class ac=new Abstract_Class() {
		
		@Override
		public void add(int a, int b) {
		int c=a*b;
		System.out.println("Multiply is:"+c);
			
		}
	};
	ac.add(10,20);

	}

}
