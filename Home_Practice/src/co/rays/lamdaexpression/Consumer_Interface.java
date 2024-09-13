package co.rays.lamdaexpression;

import java.util.function.Consumer;

public class Consumer_Interface {

	public static void main(String[] args) {
//		Consumer<String> printUpperCase=str->
//		System.out.println(str.toUpperCase());
//		printUpperCase.accept("Hello Indore");
		Consumer<String>  printLowerCase=str->
		System.out.println(str.toLowerCase());
		printLowerCase.accept("HELLO INDORE");
		

	}
	

}
