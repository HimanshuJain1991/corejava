package in.com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionToArray {

	public static void main(String[] args) {
	Collection c=new ArrayList();
	c.add(101);
	c.add("himanshu");
	c.add(658);
	System.out.println(c);
//	for (Object object : c) {
//	System.out.println(object);	
//	}
	//print all elements of array
	Object [] oArray=c.toArray();
	//System.out.println(oArray);
	for (Object object : oArray) {
		System.out.println(object);
	}
         System.out.println(c);
         ArrayList ar=new ArrayList();
         ar.add("Rahul");
         ar.add("Shivam sir");
         ar.add(1254);
         ar.add(5.5);
         System.out.println(ar);
	}
	


}
