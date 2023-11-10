package in.com.set_interface_practice;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TheSoretedSetInterface {

	public static void main(String[] args) {
	   SortedSet s= new TreeSet();
	   s.add(10);s.add(9);s.add(8);s.add(5);s.add(114);s.add(8);
	   s.add(120);s.add(121);s.add(1);
	   s.add(3);
	   System.out.println(s);
	  System.out.println( s.first());
	  System.out.println(s.last());
	  SortedSet s1=new TreeSet();
	 s1= s.subSet(8, 121);//get value from within range
	// s.subSet(fromElement, toElement)
	 System.out.println("Elements are of sub set"+s1);
	
	 System.out.println("headset:"+s.headSet(7));//it takes only less than 7 numbers
	  System.out.println("tailset"+s.tailSet(114));

	}

}
