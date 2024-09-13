package in.com.list_interface;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vec=new Vector<Integer>();
    vec.add(2);vec.add(4);
    vec.add(8);vec.add(9);
    vec.add(6);
    System.out.println(vec);
    System.out.println(vec.size());
    vec.add(66);
    System.out.println(vec.size());
    }
        
    
}
