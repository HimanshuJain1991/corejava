package in.com.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Example {

	public static void main(String[] args) { 
	List list=new  ArrayList();
    list.add(101);list.add(254);list.add("Himanshu Jain");
    list.add(145);list.add("Hello");list.add(2.5);
    System.out.println(list);
    list.add(1, 788);
    System.out.println(list); 
    System.out.println(list.get(3));
    System.out.println("Removed Element is:"+list.remove(2));
    System.out.println(list);
    System.out.println("replace element: "+list.set(1, "Shruti"));
    System.out.println(list);
    System.out.println(list.subList(2, 5) );
    System.out.println("index of"+list.indexOf(4));
    System.out.println("last index of"+list.lastIndexOf(101));
  
	}

}
