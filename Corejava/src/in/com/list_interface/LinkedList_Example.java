package in.com.list_interface;

import java.awt.List;
import java.util.LinkedList;

public class LinkedList_Example {

	public static void main(String[] args) {
	  LinkedList l=new LinkedList();
	  l.add(101);l.add(458);
	  l.add(2);l.add(4);
	  l.add(878);l.add(44);
	  System.out.println(l);
	  l.add(2, 99);
	  System.out.println(l);
	  l.remove(1);
	  System.out.println(l);
	  System.out.println(l.set(0, "Shruti"));
	  System.out.println(l);
	  System.out.println(l.indexOf(4));
	  System.out.println(
			  );

	}

}
