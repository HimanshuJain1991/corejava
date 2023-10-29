package in.com.oops_test;



public class Method_Overriding  extends Add{
	public void display(int a,int b) {
		System.out.println("Child class running "+a+" "+b);
	}

	public static void main(String[] args) {
	Add a=new Method_Overriding();
	a.display(10, 20);

	}

}
