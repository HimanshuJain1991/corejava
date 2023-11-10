package in.com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vectot_Example {

	public static void main(String[] args) {
		Vector vec= new Vector();
		vec.add(101);vec.add(5);vec.add(45);
		vec.add(10);vec.add(250);
		System.out.print(vec);
		Enumeration enm=vec.elements();
		vec.add(455);vec.add(4);
		System.out.println(vec);
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
		Iterator it=vec.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
	}

}
