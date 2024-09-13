package in.com.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add("Himanshu Jain");
        list.add(3.5);
        list.add(1);
        System.out.println(list);
        list.add(0, 20);
        System.out.println(list);
        System.out.println(list.get(3));
        list.remove(5);
        System.out.println(list);
        list.set(2, 50000);
        System.out.println(list);
        System.out.println(list.subList(2, 4));
        System.out.println(list.indexOf(50000));//if element exist than it return value,otherwise return -1
        list.add(1, 3.5);
        System.out.println(list);
        System.out.println(list.lastIndexOf(3.5));
        list.add(null);
        System.out.println(list);
      
    }
}
 