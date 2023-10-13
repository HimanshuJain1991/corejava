package in.com.HomePractice1;


import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Example {

	public static void main(String[] args) {
		ArrayList <Integer> ar=new ArrayList();
		ar.add(101);
		ar.add(455);
		ar.add(485);
		ar.add(458);
		System.out.println(ar);
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
			
		}
		System.out.println("for each loop working");
		for (Integer integer : ar) {
			
			System.out.println(integer);
		}
		Iterator it=ar.iterator();
		System.out.println("Iterator is working");
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
