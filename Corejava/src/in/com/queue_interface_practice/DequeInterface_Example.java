package in.com.queue_interface_practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class DequeInterface_Example {

	public static void main(String[] args) {
		
      Deque d=new ArrayDeque();
      d.add(101);
      d.add(201);
      d.add(12);
      d.addFirst(555);
      d.addLast(698);
      
     
      System.out.println(d);
      d.removeFirst();
      System.out.println(d);

      System.out.println(d.getFirst());
      System.out.println(d.getLast());
      
      System.out.println(d);
      Deque d1=new ArrayDeque();
      d1.offer(2);d1.offer(6);d1.offer(8);d1.offer(85);
      System.out.println(d1);
      d1.offerFirst(2222);
      System.out.println(d1);
      d1.offerLast(5698);
      System.out.println(d1);
      System.out.println(d1.pollFirst());
      System.out.println(d1.pollLast());
      System.out.println(d1);
      System.out.println(d1.peekFirst());
      System.out.println(d1.peekLast());
      
	}

}
