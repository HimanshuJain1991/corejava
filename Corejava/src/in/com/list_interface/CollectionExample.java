package in.com.list_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionExample {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(2);
        c.add(5);
        c.add(4);
        c.add(88);
        c.add(555);
        System.out.println(c);
System.out.println("----------Linked LIst--------");
        Collection c1 = new LinkedList();
        c1.addAll(c);
        System.out.println(c1);
        
        System.out.println(c1.containsAll(c));
        System.out.println(c1.isEmpty());
        System.out.println(c1.size());
       // c1.clear();
        System.out.println(c1);
         System.out.println(c.contains(55));
    }
}
