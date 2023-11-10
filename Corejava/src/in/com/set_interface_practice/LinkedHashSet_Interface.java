package in.com.set_interface_practice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Interface {

	public static void main(String[] args) {
		LinkedHashSet link= new LinkedHashSet();
		link.add("A");
		link.add("Z");link.add("G");link.add(10);
		link.add(null);
		System.out.println(link);
	}

}
