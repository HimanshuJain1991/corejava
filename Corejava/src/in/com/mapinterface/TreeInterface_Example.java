package in.com.mapinterface;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeInterface_Example {

	public static void main(String[] args) {
		TreeMap h=new TreeMap();
		h.put(1, "Himanshu Jain"); 
		h.put(2, "Shruti Jain");
		h.put(110, "Riyansh Jain");
		h.put(15, "Ram Sharma");
		System.out.println(h);
	System.out.println(h.containsKey(2));
	System.out.println(h.containsValue("Shruti Jain"));
	System.out.println(h.entrySet());
	System.out.println(h.get(2));
	System.out.println(h.isEmpty());
	System.out.println(h.keySet());
	System.out.println(h.put(1, "Himanshu Jain"));
	System.out.println("removed valued: "+h.remove(1));
     System.out.println(h);	
	System.out.println(h.size());



	}

}
