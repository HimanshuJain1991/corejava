package in.com.comparable;

import java.util.Collections;
import java.util.LinkedList;

public class Bike_Test {

	public static void main(String[] args) {
		LinkedList<Bike> list=new LinkedList<Bike>();
		list.add(new Bike(8545, "Pulsar", 5));
		list.add(new Bike(6985, "R15", 58));
		list.add(new Bike(2548, "Passion Pro", 2));
		System.out.println(list);
		
		System.out.println("-----Sort by gear-------");
		Collections.sort(list);
		System.out.println(list);
		

	}

}
