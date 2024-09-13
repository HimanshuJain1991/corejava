package co.rays.lamdaexpression;

public class Lamda_Example {
	
public static void main(String[] args) {
	Runnable runnable=()->{
		
		System.out.println("Hello World");
	};
	
	runnable.run();
}
}
