package in.com.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {

	public static void main(String[] args) {
		HashMap h=new HashMap();
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
