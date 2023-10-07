package in.com.CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class List_Interface  {

	public static void main(String[] args) {
	  LinkedList l=new LinkedList();
	  l.add("Himanshu Jain");
	  l.add(101);
	  l.add("Hariom");
	  System.out.println(l);
	  l.add(1, 501);
	  System.out.println(l);
	  //l.get(1);
	  System.out.println(l.get(1));
//	  l.remove(1);
//	  System.out.println(l);
	  l.set(1, 805);
	  System.out.println(l);
//	  l.subList(2, 3);
//	  System.out.println(l);
	 // System.out.println(l.indexOf(3));
	 // System.out.println(l.lastIndexOf(l));
	  

	}

}
