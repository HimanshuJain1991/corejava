package in.com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_Method {

	public static void main(String[] args) {
		ArrayList al=new ArrayList ();
		al.add(201);
		al.add(650);
		al.add(485);
		al.add(301);
		
		System.out.println(al);
	   Collections.sort(al);
	   System.out.println("after sorting");
	   System.out.println(al);

	}

}
