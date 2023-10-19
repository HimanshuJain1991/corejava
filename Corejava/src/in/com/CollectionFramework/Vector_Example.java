package in.com.collectionframework;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Example {

	public static void main(String[] args) {
		Vector vec=new Vector();
		vec.add(101);vec.add(541);
		vec.add(201);vec.add(5);
		vec.add(301);
		System.out.println(vec);
		Enumeration e=vec.elements();
          vec.add(874);
          vec.add(785);
          System.out.println(vec);
          while(e.hasMoreElements()) {
        	  System.out.println(e.nextElement());
          }
        
	}

}
