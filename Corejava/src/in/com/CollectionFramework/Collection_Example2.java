package in.com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Example2 {

	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<Integer>();
		c.add(101);c.add(102);c.add(103);c.add(104);
		System.out.println(c);
		Collection c1=new ArrayList();
		c1.add("Himanshu Jain");c1.add("Harish");
		c1.add("Ram");c1.add("Hariom");
    System.out.println(c1);
    
    c1.addAll(c);
    System.out.println(c1);
    Object o=c1.contains("Himanshu Jain");
    System.out.println(o);
    boolean b=c1.isEmpty();
    System.out.println(b);
    
    //System.out.println(c1.getClass());
    c1.clear();
    System.out.println("List is Empty"+c1);
	}


}
 