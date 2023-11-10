package in.com.set_interface_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Collection_Method {
	
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(45);
		c.add(10);c.add(48);
		c.add(null);c.add(4);c.add(null);
		System.out.println(c);
		System.out.println(c.contains(null));
		System.out.println(c.containsAll(c));
		System.out.println(c.isEmpty());
	
		System.out.println("retains all:"+c.retainAll(c));
		Collection c1=new ArrayList();
		c1.add(1);
		c1.add(2);c1.add(3);
		c1.add(4);
		System.out.println(c1);
	     System.out.println(c.containsAll(c));
	     System.out.println(c.size());
//	    Stream s=c.parallelStream();
//	    System.out.println(s);
	    

	}

}
