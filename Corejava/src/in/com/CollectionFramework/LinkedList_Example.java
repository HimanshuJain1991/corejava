package in.com.collectionframework;

import java.util.LinkedList;

public class LinkedList_Example {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(101);
		l.add(102);l.add(103);
		System.out.println(l);
		l.add(1, 555);
		l.add(555);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.get(1));
		System.out.println("index position is:"+l.indexOf(555));
		System.out.println(l.set(1, 7));
		System.out.println(l);
		System.out.println(l.lastIndexOf(555));
	System.out.println("sublist method"+l.subList(0, 6));
	System.out.println(l.get(0));
	
	

	}

}
