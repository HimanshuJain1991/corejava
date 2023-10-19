package in.com.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorInterface {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("Himanshu Jain");
		c.add("Hariom");
		c.add(125);
		Iterator it=c.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o);
		}
		
		Iterator it1=c.iterator();	
		Object ob1=it1.next();
		System.out.println(ob1);
		
			
			if(it1.hasNext()) {
				
				it1.remove();
				System.out.println(" Remove Complete Next Elements"+c);
				
			}
			//System.out.println(c);
		
		
		

	}

}
