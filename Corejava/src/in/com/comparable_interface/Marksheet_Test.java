package in.com.comparable_interface;

import java.util.ArrayList;
import java.util.Collections;

public class Marksheet_Test {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new Marksheet("501", "Himanshu Jain", 100));
		list.add(new Marksheet("101", "Riyansh Jain", 98));
		list.add(new Marksheet("105", "Shruti Jain", 90));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
