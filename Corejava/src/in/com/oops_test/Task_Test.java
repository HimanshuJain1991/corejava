package in.com.oops_test;

public class Task_Test implements Sum_Interface {
	@Override
	public  void sum(int a, int b) {
	  System.out.println(a+" "+b);
		
	}

	public static void main(String[] args) {
		Task_Test t=new Task_Test();
		t.sum(10, 45);

	}

	

}
