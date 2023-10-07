package in.com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection_Methods {

	public static void main(String[] args) {
      Collection c1=new ArrayList();
      c1.add(101);
      c1.add("Himanshu");
      c1.add(1.5);
      c1.add('h');
      System.out.println(c1);
        System.out.println("size of c1 ="+c1.size());
      Collection c2 =new ArrayList();
      c2.add(101);
      c2.add("Ram");
      c2.add("Hariom");
      c2.add(501);
      System.out.println(c2);
      c1.addAll(c2);
      System.out.println(c1);
//      c1.clear();
//      System.out.println(c1);    
       System.out.println( c1.contains("Himanshu"));
       
       System.out.println(c1.containsAll(c2));
       
       boolean b=c1.isEmpty();
       if(b==false) {
    	   System.out.println("list  containts elements");
    	   System.out.println("valuse="+b);
//    	   c2.iterator();
//    	   System.out.println(c2);
    	   c2.remove("Hariom");
    	   System.out.println(c2);
    	   c2.removeAll(c2);
    	   System.out.println(c2);
       }
      
	}

}
