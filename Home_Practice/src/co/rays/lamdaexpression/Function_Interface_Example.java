package co.rays.lamdaexpression;

import java.util.function.Function;

public class Function_Interface_Example {

	public static void main(String[] args) {
	Function<String, Integer> integerToString=numString ->
	Integer.valueOf(numString);
	int i=integerToString.apply("456");
	System.out.println(i);
	
	}

}
