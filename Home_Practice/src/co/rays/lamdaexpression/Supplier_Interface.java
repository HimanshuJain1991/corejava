package co.rays.lamdaexpression;

import java.util.function.Supplier;

public class Supplier_Interface {

	public static void main(String[] args) {
		Supplier<Double> randomValue=()->Math.random();
		Double result=randomValue.get();
		System.out.println(result);

	}

}
